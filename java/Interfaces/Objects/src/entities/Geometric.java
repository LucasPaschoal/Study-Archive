package entities;

public abstract class Geometric implements GeometricService{

    private String color;

    public Geometric(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
