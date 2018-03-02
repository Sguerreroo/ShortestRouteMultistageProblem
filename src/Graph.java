public class Graph {

    private int numberOfNodes;
    private Vertex initial, goal;
    private Vertex[] listOfVertices;
    private Edge[] listOfEdges;

    public Graph(Vertex initial, Vertex goal, Vertex[] listOfVertices, Edge[] listOfEdges) {
        this.numberOfNodes = listOfVertices.length ;
        this.initial = initial;
        this.goal = goal;
        this.listOfVertices = listOfVertices;
        this.listOfEdges = listOfEdges;
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public Vertex getInitial() {
        return initial;
    }

    public Vertex getGoal() {
        return goal;
    }

    public Vertex[] getListOfVertices() {
        return listOfVertices;
    }

    public Edge[] getListOfEdges() {
        return listOfEdges;
    }

    public boolean goalTest(Vertex state) {
        return state.equals(this.goal);
    }

}