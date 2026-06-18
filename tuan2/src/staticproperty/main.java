package staticproperty;

public class main {
    public static void main(String[] args) {
        car car1 = new car("Mazda 3","Skyactiv 3");
        System.out.println(car.number);
        car car2 = new car("Mazda 2","Skyactiv 2");
        System.out.println(car.number);
    }
}
