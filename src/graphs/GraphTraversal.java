package graphs;

import java.util.LinkedList;
import java.util.Queue;

public class GraphTraversal {
    /**
     * Depth first traversal will have some overhead
     * since we're using recursion
     */
    public static void depthFirst(Node start) {
        if (start == null) return;

        start.visit();

        for (Node child : start.getChildren()) {
            if (!child.hasVisited()) {
                depthFirst(child);
            }
        }
    }

    /**
     * Breadth first will be faster
     * as it is iterative
     */
    public static void breadthFirst(Node start) {
        if (start == null) return;

        Queue<Node> q = new LinkedList<>();

        q.offer(start);
        start.visit();

        while (!q.isEmpty()) {
            Node current = q.poll();
            for (Node child : current.getChildren()) {
                if (!child.hasVisited()) {
                    child.visit();
                    q.offer(child);
                }
            }
        }
    }
}
