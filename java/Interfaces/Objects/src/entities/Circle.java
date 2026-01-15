package entities;

import java.awt.*;

public class Circle extends Geometric {
    private Double radius;

    public Circle(Double radius,String color) {
        super(color);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area(){
        return Math.PI * Math.pow(radius, 2);
    }

}
