import java.util.*;

class BFS_1 {

    static Scanner sc = new Scanner(System.in);
    public static LinkedList<Integer> adjacent[];// List of list -
    public static LinkedList<Integer> InDegree[];
    public static LinkedList<Integer> OutDegree[];

    public static LinkedList<Integer> Visited;
    public static LinkedList<Integer> Parent;
    private static int totalNode;

    private static LinkedList<Integer> Level = new LinkedList<>();

    // Construct Directed Graph
    public static void CreateDirectedGraph(int Node, int Edge) {
        int src1, src2;
        totalNode = Node;
        adjacent = new LinkedList[Node + 1];
        InDegree = new LinkedList[Node + 1];
        OutDegree = new LinkedList[Node + 1];

        for (int i = 0; i <= Node; i++) {
            adjacent[i] = new LinkedList<>();
            InDegree[i] = new LinkedList<>();
            OutDegree[i] = new LinkedList<>();

            Level.add(-1);// For node weights
        }

        for (int i = 0; i < Edge; i++) {
            System.out.print("\t\t Edge [ " + (i + 1) + " ]" + " : ");
            src1 = sc.nextInt();
            src2 = sc.nextInt();

            adjacent[src1].add(src2);
            // adjacent[src2].add(src1);

            OutDegree[src1].add(src2);
            InDegree[src2].add(src1);
        }

    }

    // Construct Undirected Graph
    public static void CreateUndirectedGraph(int Node, int Edge) {
        int src1, src2;
        totalNode = Node;
        adjacent = new LinkedList[Node + 1];

        for (int i = 0; i <= Node; i++) {
            adjacent[i] = new LinkedList<>();

            Level.add(-1);// For node weight
        }

        for (int i = 0; i < Edge; i++) {
            System.out.print("Edge [ " + (i + 1) + " ]" + " : ");
            src1 = sc.nextInt();
            src2 = sc.nextInt();

            adjacent[src1].add(src2);
            adjacent[src2].add(src1);
        }

    }

    // Print The Graph
    public static void PrintGraph(int N, int E) {
        System.out.println("\n The Graph represents...");

        for (int i = 1; i <= N; i++) {
            System.out.println(" Node [ " + (i) + " ] :      " + (adjacent[i]));
        }
    }

    // Print InOut-Degrees of the Graph
    public static void PrintInOutDegree(int N, int E) {
        System.out.println(" In-Out Degrees....");

        for (int i = 1; i <= N; i++) {
            System.out.println(" Node [ " + i + " ] :        In-deg -  " + InDegree[i] + "      Out-deg -       "
                    + OutDegree[i]);
        }
    }

    // Initialize with -1 for NULL indication. Visited: BFS, Parent : Path
    private static void BfsInitialize() {
        Visited = new LinkedList<>();
        Parent = new LinkedList<>();
        for (int i = 0; i <= totalNode; i++) {
            Visited.add(i, -1);
            Parent.add(i, -1);
        }
    }

    // BFS construction and Printing
    public static void FindBfs(int startNode) {
        BfsInitialize();
        System.out.println("Level order Graph : ");

        Queue<Integer> Q = new LinkedList<>();
        Q.add(startNode);
        Q.add(-10);

        int value = 0;

        while (!Q.isEmpty()) {
            int nodeRemoved = Q.remove();

            if (nodeRemoved != -10) {
                Level.add(nodeRemoved, value++);

                Visited.set(nodeRemoved, nodeRemoved);// Visiting that node ( index , value )

            }

            if (nodeRemoved == -10) {
                if (!Q.isEmpty()) {
                    Q.add(-10);
                    System.out.println();

                }

            } else {
                
                for (int i = 0; i < adjacent[nodeRemoved].size(); i++) {
                    
                    if (Visited.get(adjacent[nodeRemoved].get(i)) == -1) {
                        System.out.print(nodeRemoved + " ");
                        
                        Q.add(adjacent[nodeRemoved].get(i));
                        
                        Parent.set(adjacent[nodeRemoved].get(i), nodeRemoved); // set parent for finding path
                        // index- Child Node value- Parent Node
                    }
                    
                }
                
            }

        }
        System.out.println();

        // Print BFS
        System.out.print("\n\n Visited Nodes by BFS :");
        for (int i = 1; i < Visited.size(); i++) {
            System.out.print(" " + Visited.get(i));
        }
    }

    public static void FindCost(int node){
        System.out.print("\nCost : ");
        for(int i=1; i<=node; i++){
            System.out.print(Level.get(i)+" ->");
        }
        System.out.println();
    }

    // Print Path of the Graph
    public static void FindPath(int srcNode, int desNode) {
        if (Parent.get(desNode) == -1) {
            return;
        }
        if (srcNode == desNode) {
            System.out.print(" -> " + srcNode);
        } else if (Parent.get(desNode) == -1) {
            System.out.print(" Path ends.....");
        } else {
            FindPath(srcNode, Parent.get(desNode));
            // Always traverse according to the destination Node

            System.out.print(" -> " + desNode);// After executing the return, element will be printed from backward
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\n");
        System.out.print("Enter number of Nodes and Edges : ");
        int nodes = sc.nextInt();
        int edges = sc.nextInt();

        CreateUndirectedGraph(nodes, edges);
        // CreateDirectedGraph(nodes, edges);
        PrintGraph(nodes, edges);
        // PrintInOutDegree(nodes, edges);

        System.out.print("\n\n Enter Node to Start BFS : ");
        int startNode = sc.nextInt();
        FindBfs(startNode);
        FindCost(4);

        // System.out.print("\n\n Enter source and Destination : ");
        // int src = sc.nextInt();
        // int des = sc.nextInt();
        // FindPath(src, des);

    }
}