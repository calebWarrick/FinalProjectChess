public class Piece {
    private int location;
    private String color;
    private String name;
    private boolean isCaptured;

    public Piece(int location, String name, String color){
        this.name = name;
        this.color = color;
        this.location = location;
        isCaptured = false;
    }

    public boolean isCaptured() {
        return isCaptured;
    }

    public void setCaptured(boolean captured) {
        isCaptured = captured;
    }
}
