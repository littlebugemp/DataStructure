package graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.printGraph();
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addEdge("a","b");
        graph.printGraph();

    }
}
