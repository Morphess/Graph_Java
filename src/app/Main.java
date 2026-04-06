package app;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);

        System.out.println("Graph after adding vertices and edges: ");
        graph.printGraph();
        System.out.println();

        System.out.println("Has vertex 3: " + graph.hasVertex(3));
        System.out.println("Has vertex 5: " + graph.hasVertex(5));
        System.out.println();

        System.out.println("Has edge 1-2: " + graph.hasEdge(1, 2));
        System.out.println("Has edge 3-4: " + graph.hasEdge(3, 4));
        System.out.println();

        graph.removeEdge(1, 2);
        System.out.println("Graph after removing edge 1-2");
        graph.printGraph();
        System.out.println();

        graph.removeVertex(3);
        System.out.println("Graph after removing vertex 3:");
        graph.printGraph();


    }
}