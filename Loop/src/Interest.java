import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double rate = 1.0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter investment amount:");
        money = sc.nextDouble();
        System.out.print("Enter number of month:");
        month = sc.nextInt();
        System.out.print("Enter investment rate:");
        rate = sc.nextDouble();

        double total = 0;
        for (int i = 1; i < month; i++) {
            total = total + money * (rate/100)/12 * month;
        }

        System.out.println("Total interest is $" + total);
    }
}
