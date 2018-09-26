package com.personal.sorting;

import java.util.Iterator;

public class DFS {

    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        // print the adjacency list representation of
        // the above graph
        graph.printGraph();
        boolean[] visited = new boolean[graph.getVertex()];
        DFS(graph, 0, visited);

    }

    public static void DFS(Graph g, int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        Iterator<Integer> ite = g.getLinkedLists()[vertex].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj]) {
                DFS(g, adj, visited);
            }
        }
    }

}
