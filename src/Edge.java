public class Edge {

    private int cost;
    private Vertex vertex1, vertex2;

    public Edge(int cost, Vertex vertex1, Vertex vertex2) {
        this.cost = cost;
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    public int getCost() {
        return cost;
    }

    public Vertex getVertex1() {
        return vertex1;
    }

    public Vertex getVertex2() {
        return vertex2;
    }
}