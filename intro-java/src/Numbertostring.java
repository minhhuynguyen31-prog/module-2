import java.util.Scanner;

public class Numbertostring {
    public static void main(String[] args) {

        int input;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter one");
        input = sc.nextInt();
        int ten = input /10 ;
        int count =input %10;

        if (input >= 11 && input <= 19) {
            switch (input) {
                case 11: System.out.print("Eleven"); break;
                case 12: System.out.print("Twelve"); break;
                case 13: System.out.print("Thirteen"); break;
                case 14: System.out.print("Fourteen"); break;
                case 15: System.out.print("Fifteen"); break;
                case 16: System.out.print("Sixteen"); break;
                case 17: System.out.print("Seventeen"); break;
                case 18: System.out.print("Eighteen"); break;
                case 19: System.out.print("Nineteen"); break;
            }
        } else {
            // BƯỚC 2: SWITCH 1 - In hàng chục (Nếu từ 20 trở lên)
            if (ten >= 2 && ten <= 9) {
                switch (ten) {
                    case 2: System.out.print("Twenty "); break;
                    case 3: System.out.print("Thirty "); break;
                    case 4: System.out.print("Forty "); break;
                    case 5: System.out.print("Fifty "); break;
                    case 6: System.out.print("Sixty "); break;
                    case 7: System.out.print("Seventy "); break;
                    case 8: System.out.print("Eighty "); break;
                    case 9: System.out.print("Ninety "); break; // Sửa lại chữ Ninety từ code cũ của bạn
                }
            }

            // BƯỚC 3: SWITCH 2 - In hàng đơn vị (Ghép tiếp vào sau)
            // Điều kiện: Chỉ in khi hàng đơn vị > 0, hoặc khi số nhập vào chính xác là số 0 hoặc số nhỏ hơn 10
            if (count > 0 || input == 0) {
                switch (count) {
                    case 0: System.out.print("Zero"); break; // Thêm trường hợp số 0 độc lập
                    case 1: System.out.print("One"); break;
                    case 2: System.out.print("Two"); break;
                    case 3: System.out.print("Three"); break;
                    case 4: System.out.print("Four"); break;
                    case 5: System.out.print("Five"); break;
                    case 6: System.out.print("Six"); break;
                    case 7: System.out.print("Seven"); break;
                    case 8: System.out.print("Eight"); break;
                    case 9: System.out.print("Nine"); break;
                    case 10: System.out.print("Ten"); break; // Giữ lại case 10 nếu input truyền vào đúng bằng 10
                }
            }
            System.out.println();
        }

    }
}
