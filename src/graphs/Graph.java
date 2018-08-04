package graphs;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Node> nodes;
    private boolean isBidirectional;

    public Graph(boolean isBidirectional) {
        this.nodes = new ArrayList<>();
        this.isBidirectional = isBidirectional;
    }

    public void addNode(int val) {
        Node n = new Node(val);
        nodes.add(n);
    }

    public Node searchNode(int val) {
        if (nodes.size() == 0) return null;

        for (Node n : nodes) {
            if (n.getVal() == val) {
                return n;
            }
        }

        return null;
    }

    public void addConnection(int nodeVal1, int nodeVal2) {
        Node n1 = searchNode(nodeVal1);
        Node n2 = searchNode(nodeVal2);

        // No connection to be made
        if (n1 == null || n2 == null) { return; }

        // We add each as its child
        if (this.isBidirectional) {
            n1.addChild(n2);
            n2.addChild(n1);
            return;
        }

        // Otherwise we say that the left argument is the parent of the right;
        n1.addChild(n2);
    }
}
