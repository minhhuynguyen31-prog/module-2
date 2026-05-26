import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int [] arr = new int [6];
        int[] arr1 = new int [5];
        Scanner sc = new Scanner(System.in);
        int i= 0;
        while(i<arr.length){
            System.out.print("Enter element" + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        int j= 0;
        while(j<arr1.length){
            System.out.print("Enter element" + (j + 1) + " : ");
            arr1[j] = sc.nextInt();
            j++;
        }

        int[]  arr2 = new int [arr1.length+arr.length];
        for (int k = 0; k < arr.length; k++) {
            arr2[k] = arr[k];
        }

        for (int k = 0; k < arr1.length; k++) {
            arr2[arr.length + k] = arr1[k];
        }
        System.out.print("Merged array: ");
        for (int k = 0; k < arr2.length; k++) {
            System.out.print(arr2[k] + " ");
        }

        sc.close();

    }
}
