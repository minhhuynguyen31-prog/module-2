import java.util.Arrays;
import java.util.Scanner;

public class PushArray {
    public static void main(String[] args) {
        int [] arr = {10, 4, 6, 7, 8, 6, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter element:");
        int x = input.nextInt();

        System.out.println("Enter index:");
        int index = input.nextInt();

        if(index < 0 || index >= arr.length) {
            System.out.println("Invalid index");
        }else {
            int newarr[]  = new int [arr.length+1];
            for(int i = 0; i < newarr.length; i++){
                if(i <index) {
                    newarr[i] = arr[i];

                }
                else if(i ==index){
                    newarr[i] = x;
                }
                else {
                    newarr[i] = arr[i-1] ;
                }
            }
            System.out.println("Mảng sau khi chèn: " + Arrays.toString(newarr));
        }
    }
}
