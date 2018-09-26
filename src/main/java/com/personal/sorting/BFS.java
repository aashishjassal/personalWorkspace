package com.personal.sorting;

import java.util.LinkedList;
import java.util.ListIterator;

public class BFS {

    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 4);

        // print the adjacency list representation of
        // the above graph
        graph.printGraph();

        BFS(graph, 0);

    }

    public static void BFS(Graph g, int vertex) {
        boolean visited[] = new boolean[g.getVertex()];
        LinkedList bfsQueue = new LinkedList<>();
        bfsQueue.add(vertex);
        System.out.println("Adding " + vertex);
        visited[vertex] = true;
        while (bfsQueue.size() != 0) {
            vertex = (int) bfsQueue.poll();
            LinkedList<Integer> adjacencyList = g.getLinkedLists()[vertex];
            ListIterator<Integer> listIterator = adjacencyList.listIterator();
            while (listIterator.hasNext()) {
                Integer value = listIterator.next();
                if (!visited[value]) {
                    visited[value] = true;
                    System.out.println("Adding " + value);
                    bfsQueue.add(value);
                }

            }
        }


    }

}
