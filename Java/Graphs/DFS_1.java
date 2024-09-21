import java.util.*;

class DFS_1 {

    static Scanner sc = new Scanner(System.in);
    private static LinkedList<Integer> adjacent[];// List of list -2D
    private static LinkedList<Integer> InDegree[];
    private static LinkedList<Integer> OutDegree[];

    private static LinkedList<Integer> Visited;// For BFS
    private static LinkedList<Integer> Parent;// For Path
    

    private static int totalNodes;

    // Declaring colors for DFS
    static final int white = 1, grey = 2, black = -1;
    // static int greyPath[];
    private static LinkedList<Integer> color;
    // Calculating time for nodes
    private static int StartingTime[], EndingTime[], time = 0;

    public static void CreateDirectedGraph(int Node, int Edge) {
        int src1, src2;
        totalNodes = Node;
        adjacent = new LinkedList[Node + 5];
        InDegree = new LinkedList[Node + 5];
        OutDegree = new LinkedList[Node + 5];

        for (int i = 0; i <= Node; i++) {
            adjacent[i] = new LinkedList<>();
            InDegree[i] = new LinkedList<>();
            OutDegree[i] = new LinkedList<>();

        }

        for (int i = 0; i < Edge; i++) {
            System.out.print("\t\t Edge [ " + (i + 1) + " ]" + " : ");
            src1 = sc.nextInt();
            src2 = sc.nextInt();

            adjacent[src1].add(src2);

            OutDegree[src1].add(src2);
            InDegree[src2].add(src1);
        }

    }

    // ********** Construct Undirected Graph ***********
    public static void CreateUndirectedGraph(int Node, int Edge) {
        int src1, src2;
        totalNodes = Node;
        adjacent = new LinkedList[Node + 5];

        for (int i = 0; i <= Node; i++) {
            adjacent[i] = new LinkedList<>();
        }

        for (int i = 0; i < Edge; i++) {
            System.out.print("Edge [ " + (i + 1) + " ]" + " : ");
            src1 = sc.nextInt();
            src2 = sc.nextInt();

            adjacent[src1].add(src2);
            adjacent[src2].add(src1);
        }

    }

    // ********* Printing The Graph *********
    public static void PrintGraph() {
        System.out.println("\n The Graph represents...");

        for (int i = 1; i <= totalNodes; i++) {
            System.out.println(" Node [ " + (i) + " ] :      " + (adjacent[i]));
        }
    }

    // *********** Print InOut-Degrees of the Graph ************
    public static void PrintInOutDegree() {
        System.out.println(" In-Out Degrees....");

        for (int i = 1; i <= totalNodes; i++) {
            System.err.println(" Node [ " + i + " ] :        In-deg -  " + InDegree[i] + "      Out-deg -       "
                    + OutDegree[i]);
        }
    }

    // ********** Initialize with -1 for NULL indication. Visited: BFS, Parent :
    // Path ************
    private static void BfsInitialize() {
        Visited = new LinkedList<>();
        Parent = new LinkedList<>();
        for (int i = 0; i <= totalNodes; i++) {
            Visited.add(i, -1);
            Parent.add(i, -1);
        }
    }

    // ****************** BFS construction and Printing ***************
    public static void FindBfs(int startNode) {
        BfsInitialize();

        Queue<Integer> Q = new LinkedList<>();
        Q.add(startNode);

        while (!Q.isEmpty()) {
            int currentNode = Q.remove();
            Visited.set(currentNode, currentNode);// ( index , value )

            for (int i = 0; i < adjacent[currentNode].size(); i++) {

                if (Visited.get(adjacent[currentNode].get(i)) == -1) {

                    Q.add(adjacent[currentNode].get(i));

                    Parent.set(adjacent[currentNode].get(i), currentNode); // set parent for finding path
                    // index- Child Node value- Parent Node
                }
            }
        }

        // ************ Print BFS *************
        System.out.print("\n\n Visited Nodes by BFS :");
        for (int i = 1; i < Visited.size(); i++) {
            System.out.print(" " + Visited.get(i));
        }
    }

    // *************** Print Path for BFS *****************
    public static void FindPath(int srcNode, int desNode) {
        if (srcNode == desNode) {
            System.out.print(" -> " + srcNode);
        } else if (Parent.get(desNode) == -1) {
            System.out.print(" Path ends.....");
        } else {
            FindPath(srcNode, Parent.get(desNode));
            // Always traverse according to the destination Node

            System.out.print(" -> " + desNode);// After executing return, element will be printed from backward
        }
    }

    // *********** DFS starts ************
    // color initialization for DFS
    static void initializeColor() {
        color = new LinkedList<>();
        // greyPath = new int[totalNodes+1];
        // Arrays.fill(greyPath, -1);

        StartingTime = new int[totalNodes + 5];
        EndingTime = new int[totalNodes + 5];

        for (int i = 0; i <= totalNodes; i++) {
            color.add(white);
        }
    }

    public static void FindDfs() {
        initializeColor();

        System.out.print("\n\nDFS visited : \n");

        for (int i = 1; i <= totalNodes; i++) {
            if (color.get(i) == white) {
                DFS_adjacent(i);
            }
        }

        // Print time information
        System.out.println("\nTime information of node traversing ");
        for (int i = 1; i <= totalNodes; i++) {
            System.out.print("\nNode [ " + i + " ] - Starts : " + StartingTime[i] + " Ends : " + EndingTime[i]);
        }

    }

    private static void DFS_adjacent(int nodeIndex) {
        // Time starts
        StartingTime[nodeIndex] = ++time;

        color.set(nodeIndex, grey);// Operation will be performed thats why color changed into grey
        // greyPath[nodeIndex]=grey;

        for (int i = 0; i < adjacent[nodeIndex].size(); i++) {

            int adjacentNode = adjacent[nodeIndex].get(i);// Assigning adjacent node

            // ******** Finding Cycle ********
            
            if (color.get(adjacentNode) == white) {
                DFS_adjacent(adjacentNode);
            }
            // findCycle(nodeIndex);

        }

        // Change color into black when its start backtracking
        color.set(nodeIndex, black);

        // Finish time
        EndingTime[nodeIndex] = ++time;
        System.out.print(" " + nodeIndex);// Print the node after it becomes black
    }

    public static void main(String[] args) {
        System.out.println("\n\n");
        System.out.print("Enter number of Nodes and Edges : ");

        CreateUndirectedGraph(sc.nextInt(), sc.nextInt());
        // CreateDirectedGraph(sc.nextInt(), sc.nextInt());
        PrintGraph();
        // PrintInOutDegree();

        // System.out.print("\n\n Enter Node to Start BFS : ");
        // int startNode = sc.nextInt();
        // FindBfs(startNode);

        // System.out.print("\n\n Enter source and Destination : ");
        // int src = sc.nextInt();
        // int des = sc.nextInt();
        // FindPath(src, des);

        System.out.print("\nDFS running...");
        FindDfs();
        System.out.println();

        // isCyclic();

    }
}