import java.util.*;

class Undirected_Directed_Graph {

    static Scanner sc = new Scanner(System.in);
    public static LinkedList<Integer> adjacent[];
    public static LinkedList<Integer> InDegree[];
    public static LinkedList<Integer> OutDegree[];

    public static void CreateDirectedGraph(int Node, int Edge) {
        int src1, src2;
        adjacent = new LinkedList[Node + 1];
        InDegree = new LinkedList[Node + 1];
        OutDegree = new LinkedList[Node + 1];

        for (int i = 0; i <= Node; i++) {
            adjacent[i] = new LinkedList<>();
            InDegree[i] = new LinkedList<>();
            OutDegree[i] = new LinkedList<>();
        }

        for (int i = 0; i < Edge; i++) {
            System.out.print("\t\t\t\t\t\t\t Edge [ " + (i + 1) + " ]" + " : ");
            src1 = sc.nextInt();
            src2 = sc.nextInt();

            adjacent[src1].add(src2);
            // adjacent[src2].add(src1);
            
            OutDegree[src1].add(src2);
            InDegree[src2].add(src1);
        }

    }



    public static void CreateUndirectedGraph(int Node, int Edge) {
        int src1, src2;
        adjacent = new LinkedList[Node + 1];

        for (int i = 0; i <= Node; i++) {
            adjacent[i] = new LinkedList<>();
        }

        for (int i = 0; i < Edge; i++) {
            System.out.print("\t\t\t\t\t\t\tEdge [ " + (i + 1) + " ]" + " : ");
            src1 = sc.nextInt();
            src2 = sc.nextInt();

            adjacent[src1].add(src2);
            adjacent[src2].add(src1);
        }

    }



    public static void PrintGraph(int N, int E) {
        System.out.println("\n \t\t\t\t\t\t\tThe Graph represents...");

        for (int i = 1; i <= N; i++) {
            System.out.println("\t\t\t\t\t\t\t Node [ " + (i) + " ] :      " + (adjacent[i]));
        }
    }



    public static void PrintInOutDegree(int N , int E){
        System.out.println("\t\t\t\t\t\t\t In-Out Degrees....");

        for(int i=1; i<=N; i++){
            System.err.println("\t\t\t\t\t\t\t Node [ "+i+" ] :        In-deg -  "+InDegree[i] + "      Out-deg -       "+OutDegree[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("\n\n");
        System.out.print("\t\t\t\t\t\t\t Enter number of Nodes and Edges : ");
        int nodes = sc.nextInt();
        int edges = sc.nextInt();

        // CreateUndirectedGraph(nodes, edges);
        CreateDirectedGraph(nodes, edges);
        PrintGraph(nodes, edges);
        PrintInOutDegree(nodes, edges);

    }
}