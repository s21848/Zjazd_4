import java.awt.*;

public class Circle extends Shape{

    private double radius;

    public Circle() {
    }

    public Circle(Color colour, double radius) {
        super(colour);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
