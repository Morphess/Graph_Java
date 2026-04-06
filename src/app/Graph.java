package app;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Graph {

    private final Map<Integer, Set<Integer>> adjacencyList = new HashMap<>();

    public void addVertex(int vertex) {
        adjacencyList.putIfAbsent(vertex, new HashSet<>());
    }
    public void addEdge(int source, int destination) {
        if (!hasVertex(source)) {
            addVertex(source);
        }
        if (!hasVertex(destination)) {
            addVertex(destination);
        }

        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }
    public void removeVertex(int vertex) {
        if (!hasVertex(vertex)) {
            return;
        }

        adjacencyList.remove(vertex);
        for (Set<Integer> neighbors : adjacencyList.values()) {
            neighbors.remove(vertex);
        }
    }

    public void removeEdge(int source, int destination) {
        if (hasVertex(source)) {
            adjacencyList.get(source).remove(destination);
        }
        if (hasVertex(destination)) {
            adjacencyList.get(destination).remove(source);
        }
    }

    public boolean hasVertex(int vertex) {
        return adjacencyList.containsKey(vertex);
    }
    public boolean hasEdge(int source, int destination) {
        return hasVertex(source) && adjacencyList.get(source).contains(destination);
    }
    public void printGraph() {
        for (Map.Entry<Integer, Set<Integer>> entry : adjacencyList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
