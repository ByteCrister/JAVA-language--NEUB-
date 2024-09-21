import java.util.*;

class CreateGraph1 {
    
    static Scanner sc = new Scanner(System.in);

    static final int max = Integer.MAX_VALUE;

    private static LinkedList<Integer> Graph[];
    private static LinkedList<Integer> cost[];

    private static int weight[];
    private static int pathIndicate[];

    private static int totalNodes, edges, src;

    CreateGraph1(int nodes, int edges) {
        this.totalNodes = nodes;
        this.edges = edges;

        Graph = new LinkedList[totalNodes + 2];
        cost = new LinkedList[totalNodes + 2];
        weight = new int[totalNodes + 2];
        pathIndicate = new int[totalNodes + 2];

        initializeGraph();

    }

       private static void initializeGraph() {

        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new LinkedList<>();
            cost[i] = new LinkedList<>();

        }
    }

     // ********** Taking inputs to create undirected Graph ***********
    public void UndirectedGraph() {
        int start, end, Weight;
        System.out.println("\nEnter source and destination nodes ...");
        for (int i = 1; i <= edges; i++) {
            System.out.print("\n Node[ " + i + " ] start - end - cost : ");

            start = sc.nextInt();
            end = sc.nextInt();
            Weight = sc.nextInt();

            Graph[start].add(end);
            Graph[end].add(start);

            cost[start].add(Weight);
            cost[end].add(Weight);
        }
    }

    // ************** Dijkstra starts ***************
    // Method - CreateDijkstra for construct the algorithm and Class - Node, to
    // store the minimum cost node using PriorityQ

    private static class Node implements Comparable<Node> {
        private int node, weight;

        Node(int n, int w) {
            this.node = n;
            this.weight = w;
        }

        @Override
        public int compareTo(Node node) {
            return Integer.compare(weight, node.weight);
        }

    }

    public void CreateDijkstra(int sourceNode) {
        src = sourceNode;
        Arrays.fill(weight, max);
        Arrays.fill(pathIndicate, -1);

        PriorityQueue<Node> Q = new PriorityQueue<>();
        Q.add(new Node(sourceNode, 0));
        weight[sourceNode] = 0;

        int currentNode, adjacentNode;
        while (!Q.isEmpty()) {
            currentNode = Q.peek().node;
            Q.poll();

            for (int i = 0; i < Graph[currentNode].size(); i++) {
                adjacentNode = Graph[currentNode].get(i);

                if (weight[currentNode] + cost[currentNode].get(i) < weight[adjacentNode]) {
                    weight[adjacentNode] = weight[currentNode] + cost[currentNode].get(i);

                    Q.add(new Node(adjacentNode, weight[adjacentNode]));
                    pathIndicate[adjacentNode] = currentNode;// initializing the minimum cost parent to its adjacent's
                    System.out.println("___Index : " + adjacentNode + ", ___value : " + currentNode);
                }
            }
        }

    }

    // *********** Finding the shortest path from source note to ... ************
    public void printShortestPath(int destination) {
        System.out.print("\n\nShortest path from " + src + " to " + destination + " : ");
        FindPath(destination);
    }

    private static void FindPath(int destinationNode) {
        if (destinationNode == src) {
            System.out.print(" -> " + destinationNode);
        } else if (pathIndicate[destinationNode] == -1) {
            System.out.print(" no path...");
        } else {
            System.out.print(" _[  " + pathIndicate[destinationNode] + "  ]_ ");
            FindPath(pathIndicate[destinationNode]);
            System.out.print(" ~> " + destinationNode);
        }
    }

    // ********** Printing the cost from source node **********
    public void printCost() {
        System.out.println("\nCost from Node " + src + " to other nodes ...\n");

        for (int i = 1; i <= totalNodes; i++) {
            System.out.println("Cost from node " + src + " - " + i + " : " + weight[i]);
        }
    }

    // ********* Printing the graph **********
    public void printGraph() {
        System.out.println("\nRunning Undirected Graph....");
        for (int i = 1; i <= totalNodes; i++) {
            System.out.println("Node [ " + i + " ] -> " + Graph[i]);

        }
    }

}

public class Dijkstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\n\nEnter number of Nodes and Edges : ");
        CreateGraph1 gh = new CreateGraph1(sc.nextInt(), sc.nextInt());

        gh.UndirectedGraph();
        gh.printGraph();

        gh.CreateDijkstra(1);
        gh.printCost();

        gh.printShortestPath(5);

    }
}
