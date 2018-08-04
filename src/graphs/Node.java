package graphs;

/**
 * For simplicity, we will work with integer nodes
 * We will also store the nodes in lists rather than arrays
 */
import java.util.ArrayList;

public class Node {
    private int val;
    private ArrayList<Node> children;
    private boolean visited;

    public Node(int val) {
        this.val = val;
        this.children = new ArrayList<>();
        this.visited = false;
    }

    public int getVal() {
        return val;
    }

    public void visit() {
        String fmt = String.format("You have visited Node %1s", val);
        System.out.println(fmt);
        this.visited = true;
    }

    public boolean hasVisited() {
        return this.visited;
    }

    public void addChild(Node child) {
        if (child != null)
            this.children.add(child);
    }

    public ArrayList<Node> getChildren() {
        return this.children;
    }
}
