package graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a directed graph, design an algorithm to find out whether
 * there is a route between two nodes.
 */

public class RoutesBetweenNodes {
    public static boolean hasRoute(Node start, Node target) {
        if (start == null || target == null) return false;
        if (start.getChildren().isEmpty()) return false;
        if (start.getVal() == target.getVal()) return true;

        // Implement a BFS
        Queue<Node> q = new LinkedList<>();
        q.offer(start);
        start.visit();

        while (!q.isEmpty()) {
            Node current = q.poll();
            current.visit();
            for (Node child : current.getChildren()) {
                if (child.getVal() == target.getVal())
                    return true;

                if (!child.hasVisited()) {
                    q.offer(child);
                }
            }
        }

        return false;
    }
}
