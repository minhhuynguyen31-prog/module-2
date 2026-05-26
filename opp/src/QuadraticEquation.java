import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to enter: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("\n--- Kết quả giải phương trình ---");
        if (delta > 0) {
            // Trường hợp delta > 0: hiển thị 2 nghiệm phân biệt
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("Nghiệm r1 = " + quadraticEquation.getRoot1());
            System.out.println("Nghiệm r2 = " + quadraticEquation.getRoot2());
        } else if (delta == 0) {
            // Trường hợp delta = 0: hiển thị 1 nghiệm duy nhất
            System.out.println("Phương trình có 1 nghiệm kép:");
            System.out.println("Nghiệm = " + quadraticEquation.getRoot1());
        } else {
            // Trường hợp delta < 0
            System.out.println("The equation has no roots");
        }
    }


    private double a;
    private double b;
    private double c;

    // Phương thức khởi tạo với 3 tham số
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }

    public double getDiscriminant() {


        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }

        return (-b + Math.pow(delta, 0.5)) / (2 * a);
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b - Math.pow(delta, 0.5)) / (2 * a);
    }
}
