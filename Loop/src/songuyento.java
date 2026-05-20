import java.util.Scanner;

public class songuyento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = sc.nextInt();
        int  count =0;
        for (int n = 2; n <= numbers; n++) {

            boolean check = true;
            for (int j = 2; j <= Math.sqrt(n); j++) {
                if (n % j == 0) {
                    check = false; // i chia hết cho j => không phải số nguyên tố
                    break;         // Thoát nhanh vòng lặp kiểm tra
                }
            }
            if(check){
                count++;
            }
        }
        System.out.println(count);
    }
}
