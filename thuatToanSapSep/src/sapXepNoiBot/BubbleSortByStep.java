package sapXepNoiBot;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter lisr size:");
        int size = input.nextInt();
        int[]list= new int[size];
        System.out.println("enter"+ list.length+"values");
        for(int i=0;i<list.length;i++){
            list[i]=input.nextInt();
        }
        System.out.print("your input list");
        for(int i=0;i<list.length;i++){
            System.out.print(list[i]+"\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[]list){
        boolean nextPass=true;
        for(int i=1 ; i<list.length&&nextPass;i++){
            nextPass=false;
            for(int j=0;j<list.length-i;j++){
                if (list[j]>list[j+1]){
                    System.out.println(("swap"+list[j]+"with"+list[j+1]));
                    int temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;

                    nextPass=true;
                }
            }

            if(nextPass==false){
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.print("list after the"+i+"sort:");
            for(int k =0;k<list.length;k++){
                System.out.print(list[k]+"\t");
            }
            System.out.println();
        }
    }

}
