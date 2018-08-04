package graphs;

import org.junit.Before;
import org.junit.Test;

public class GraphTraversalTest {
    private Graph g;

    @Before
    public void initializeGraph() {
        g = new Graph(true);
        for (int i = 0; i < 5; i++) {
            g.addNode(i+1);
        }
        g.addConnection(1, 2);
        g.addConnection(2, 5);
        g.addConnection(3, 4);
        g.addConnection(1, 4);
    }

    @Test
    public void testingDepthFirstTraversal() {
        GraphTraversal.depthFirst(g.searchNode(1));
    }

    @Test
    public void testingBreadthFirstTraversal() {
        GraphTraversal.breadthFirst(g.searchNode(1));
    }
}
