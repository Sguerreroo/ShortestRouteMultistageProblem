import java.util.ArrayList;
import java.util.List;

public class Node {

    private Vertex state;
    private Node parent;
    private int pathCost;

    public Node(Vertex state, Node parent, int pathCost) {
        this.state = state;
        this.parent = parent;
        this.pathCost = pathCost;
    }

    public Vertex getState() {
        return state;
    }

    public Node getParent() {
        return parent;
    }

    public int getPathCost() {
        return pathCost;
    }

    public List<Node> expand(Edge[] listOfEdges) {
        List<Node> nodeList = new ArrayList<>();
        for (Edge e : listOfEdges) {
            if (e.getVertex1().equals(this.getState()) && e.getVertex2().getStage() == this.getState().getStage()+1)
                nodeList.add(new Node(e.getVertex2(), this, this.pathCost+e.getCost()));
            if (e.getVertex2().equals(this.getState()) && e.getVertex1().getStage() == this.getState().getStage()+1)
                nodeList.add(new Node(e.getVertex1(), this, this.pathCost+e.getCost()));
        }
        nodeList.sort((node1, node2) -> node1.getPathCost() < node2.getPathCost() ? -1 : 1);
        return nodeList;
    }
}
