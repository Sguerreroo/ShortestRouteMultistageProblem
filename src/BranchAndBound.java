import java.util.ArrayList;
import java.util.List;

public class BranchAndBound {

    public static List<Vertex> searchMinimumCostRoute(Graph graph) {
        int bound = Integer.MAX_VALUE;
        List<Node> alivesNodes = new ArrayList<>();
        alivesNodes.add(new Node(graph.getInitial(), null, 0));
        Node goalNode = null;
        Node currentNode;

        while (!alivesNodes.isEmpty()) {
            currentNode = alivesNodes.get(0);
            alivesNodes.remove(0);
            if (graph.goalTest(currentNode.getState()) && currentNode.getPathCost() < bound) {
                goalNode = currentNode;
                bound = currentNode.getPathCost();
                continue;
            }
            if (currentNode.getPathCost() < bound)
                alivesNodes.addAll(0, currentNode.expand(graph.getListOfEdges()));
        }

        return getRoute(goalNode);
    }

    private static List<Vertex> getRoute(Node node) {
        List<Vertex> route = new ArrayList<>();
        try {
            route.add(node.getState());
        } catch (NullPointerException ex) {
            System.out.println("There is no route between initial and final vertex in the graph.");
        }
        while (node.getParent() != null) {
            route.add(node.getParent().getState());
            node = node.getParent();
        }
        return route;
    }

}