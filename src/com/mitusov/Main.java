package com.mitusov;

import com.mitusov.dijkstra.DijkstraAlgorithm;
import com.mitusov.graph.Edge;
import com.mitusov.graph.Graph;
import com.mitusov.graph.Vertex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    static List<Vertex> nodes = new ArrayList<>();
    static List<Edge> edges = new ArrayList<>();

    public static void addLane(String laneId, int sourceLocNo, int destLocNo,
                         int distance) {
        Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), distance );
        edges.add(lane);
    }
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            Vertex location = new Vertex("NodeName -" + i, "NodeId -" + i);
            nodes.add(location);
        }

        addLane("Edge_0", 0, 1, 85);
        addLane("Edge_1", 0, 2, 217);
        addLane("Edge_2", 0, 4, 173);
        addLane("Edge_3", 2, 6, 186);
        addLane("Edge_4", 2, 7, 103);
        addLane("Edge_5", 3, 7, 183);
        addLane("Edge_6", 5, 8, 250);
        addLane("Edge_7", 8, 9, 84);
        addLane("Edge_8", 7, 9, 167);
        addLane("Edge_9", 4, 9, 502);
        addLane("Edge_10", 9, 10, 40);
        addLane("Edge_11", 1, 10, 600);

        Graph graph = new Graph(nodes, edges);
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        dijkstra.execute(nodes.get(3));
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(10));


    }
}
