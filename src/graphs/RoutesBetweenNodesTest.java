package graphs;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class RoutesBetweenNodesTest {
    private Graph g;

    @Before
    public void initalizeDirectGraph() {
        g = new Graph(false);
        for (int i = 0; i < 5; i++) {
            g.addNode(i+1);
        }
        g.addConnection(1, 2);
        g.addConnection(2, 5);
        g.addConnection(3, 4);
        g.addConnection(1, 4);
    }

    @Test
    public void testHasRouteBetweenNodes() {
        Node start = g.searchNode(1);
        Node target1 = g.searchNode(2);
        Node target2 = g.searchNode(123);

        Assert.assertTrue("Test 1: Expected true", RoutesBetweenNodes.hasRoute(start, target1));
        Assert.assertFalse("Test 2: Expected false", RoutesBetweenNodes.hasRoute(start, target2));
    }
}
