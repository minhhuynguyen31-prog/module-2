import java.util.Scanner;

public class reverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter the size: ");
            size = sc.nextInt();
            if(size >20)
                System.out.println("Please enter a number greater than 20");
        }while(size>20);

        array = new int[size];
        int i=0;
        while(i<array.length){
            System.out.print("Enter the "+(i+1)+"th element: ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for(int j=0;j<array.length/2;j++){
            int temp = array[j];
            array[j] = array[size-1-j];
            array[size-1-j] = temp;

        }
        System.out.printf("%-20s%s", "elements in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
