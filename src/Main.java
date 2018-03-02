import java.util.List;

public class Main {

    public static void main(String[] args) {

        Vertex initial = new Vertex(0, 0);
        Vertex v11 = new Vertex(1, 1);
        Vertex v12 = new Vertex(1, 2);
        Vertex v13 = new Vertex(1, 3);
        Vertex v21 = new Vertex(2, 1);
        Vertex v22 = new Vertex(2, 2);
        Vertex v23 = new Vertex(2, 3);
        Vertex goal = new Vertex(3, 0);

        Vertex[] listOfVertices = new Vertex[] { initial, v11, v12, v13, v21, v22, v23, goal };
        Edge[] listOfEdges = {
            new Edge(1, initial, v11),
            new Edge(3, initial, v12),
            new Edge(2, initial, v13),
            new Edge(5, v11, v21),
            new Edge(3, v11, v23),
            new Edge(4, v12, v21),
            new Edge(3, v12, v22),
            new Edge(2, v13, v22),
            new Edge(7, v13, v23),
            new Edge(4, v21, goal),
            new Edge(1, v22, goal),
            new Edge(1, v23, goal)
        };

        Graph g = new Graph(initial, goal, listOfVertices, listOfEdges);

        List<Vertex> minimumCostRoute = BranchAndBound.searchMinimumCostRoute(g);

        for (Vertex v : minimumCostRoute)
            System.out.println(v);
    }

}