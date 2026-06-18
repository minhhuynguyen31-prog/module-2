package access_modifier_training;

public class TestCircle {
    private double radius;
    private String color;

    public TestCircle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public String getColor() {
        return color;
    }
}
