import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int [] arr = {10, 4, 6, 7, 8, 6, 0};
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        boolean isExist = false;
        for(int i = 0; i <arr.length; i++){
            if(arr[i]==(x)){

                System.out.println("Position of the students in the list " + x + " is: " + i);
                isExist = true;
                break;
            }
        }
        int[] newArray = new int[arr.length];

        // Sao chép phần tử, bỏ qua phần tử tại indexToRemove
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                continue; // Bỏ qua phần tử này, không nạp vào mảng mới
            }
            newArray[k++] = arr[i];
        }

        // In mảng mới sau khi đã xóa
        System.out.print("Mảng sau khi xóa phần tử tại index " + x + " là: ");
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        if (!isExist) {
            System.out.println("Not found" + x+ " in the list.");
        }


    }

}
