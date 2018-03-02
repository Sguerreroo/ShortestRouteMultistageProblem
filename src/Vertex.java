public class Vertex {

    private int id;
    private int stage;

    public Vertex(int stage, int id) {
        this.stage = stage;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getStage() {
        return stage;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Vertex && (((Vertex) obj).id == this.id && ((Vertex) obj).stage == this.stage);
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "id=" + id +
                ", stage=" + stage +
                '}';
    }
}
