package Resizeable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;



    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * this.length;
    }

    public double getPerimeter() {
        return 2 * (width + this.length);
    }
    @Override
    public void phongTo(double tiLePhanTram) {
        this.length += this.length* (tiLePhanTram/100.0);
        this.width += this.width* (tiLePhanTram/100.0);
    }


}
