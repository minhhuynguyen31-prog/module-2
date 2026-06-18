package access_modifier_training;

public class main {
    public static void main(String[] args) {
        TestCircle circle1 = new TestCircle(1.0);
        TestCircle circle2 = new TestCircle(1.0);

        System.out.println("radius = " + circle1.getRadius()+",Area = " + circle1.getArea()+"Color = "+circle1.getColor());
    }
}
