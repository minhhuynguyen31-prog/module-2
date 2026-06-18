package Circle_cylinder;

public class Cylinder extends Circle {
    private double height =1.0;

    public Cylinder() {}
    public  Cylinder(double height) {

    }
    public  Cylinder(double radius, double height,String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return super.getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder["+super.toString()+"height="+height+ "volume="+getVolume()+"]";
    }

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder(4.5,6.4,"yellow");
        System.out.println(cylinder2);
    }

}
