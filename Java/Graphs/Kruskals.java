import java.util.*;

class Graph2 {
    Scanner sc = new Scanner(System.in);

    // Declaring a LinkedList for nodes
    private static LinkedList<Edge> Graph = new LinkedList<>();

    // Creating an array to store Parent nodes
    private int parentOfNodes[];

    private static int totalNodes, edges;

    Graph2(int n, int e) {
        this.totalNodes = n;
        this.edges = e;
        parentOfNodes = new int[totalNodes + 1];

        initializeEdges();
    }

    // Implementation of a Edge
    static class Edge implements Comparable<Edge> {
        private int source, destination, weight;

        Edge(int a, int b, int c) {
            this.source = a;
            this.destination = b;
            this.weight = c;
        }

        @Override
        public int compareTo(Edge node) {
            return Integer.compare(weight, node.weight);
        }

    }

    private void initializeEdges() {

        // Initially parent initialize
        for (int i = 1; i <= totalNodes; i++) {
            parentOfNodes[i] = i;
        }

        // Taking inputs of source - destination - weights for construct a graph
        System.out.println("Enter node1 - node2 and weight -> _ _ _  ");
        for (int i = 1; i <= edges; i++) {
            System.out.print("\nEdge " + i + " : ");
            Graph.addLast(new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
    }

    // For find parent
    private int findParent(int node) {
        if (parentOfNodes[node] == node) {
            return node;
        } else {
            return findParent(parentOfNodes[node]);
        }
    }

    public void callKruskals() {

        // Sorting the graph into acceding order- according to there weight
        Graph.sort(Comparator.naturalOrder());

        int sumOfWeights = 0, numberOfEdges = 0, count = 0;

        for (int i = 0; i < Graph.size(); i++) {

            int node1 = findParent(Graph.get(i).source);// parent of source node
            int node2 = findParent(Graph.get(i).destination);// parent of destination node
            
            // System.out.println("Node : "+Graph.get(i).source+" parent : "+node1+" -> Node : " +Graph.get(i).destination+ " parent : "+node2);

            if (node1 != node2) {
                System.out.println("Edge[ " + (++count) + " ] - " + Graph.get(i).source + " -> " + Graph.get(i).destination);
                sumOfWeights += Graph.get(i).weight;
                numberOfEdges++;

                parentOfNodes[node2] = node1;

                if (numberOfEdges == totalNodes - 1) {
                    break;
                }
            }
        }

        System.out.println("\nMinimum spanning tree cost : " + sumOfWeights);
    }
}

public class Kruskals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of nodes and edges : ");
        Graph2 gh = new Graph2(sc.nextInt(), sc.nextInt());

        gh.callKruskals();
    }
}
