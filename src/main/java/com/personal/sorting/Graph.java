package com.personal.sorting;

import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**
 * The Class Graph.
 */
class Graph {

    /** The vertex. */
    int vertex;

    /** The linked lists. */
    LinkedList<Integer> linkedLists[];

    /**
     * Instantiates a new graph.
     * @param vertex the vertex
     */
    public Graph(int vertex) {
        this.vertex = vertex;
        linkedLists = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            linkedLists[i] = new LinkedList<>();
        }
    }

    /**
     * Adds the edge.
     * @param source the source
     * @param dest the dest
     */
    void addEdge(int source, int dest) {
        linkedLists[source].add(dest);
        linkedLists[dest].add(source);
    }

    /**
     * Prints the graph.
     */
    void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Vertex: " + i + ". Adjacency List is: " + linkedLists[i]);
        }
    }

    public int getVertex() {
        return vertex;
    }

    public LinkedList<Integer>[] getLinkedLists() {
        return linkedLists;
    }

}