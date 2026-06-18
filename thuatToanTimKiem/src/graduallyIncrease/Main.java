package graduallyIncrease;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        String string = sc.nextLine();
        LinkedList<Character> max = new LinkedList<>();

        for(int i = 0; i < string.length(); i++) {
            LinkedList<Character> temp = new LinkedList<>();
            temp.add(string.charAt(i));
            for (int j =i + 1; j < string.length(); j++ ) {
                if(string.charAt(j) > temp.getLast()){
                    temp.add(string.charAt(j));
                }
            }
            if(temp.size()>max.size()){
                max.clear();
                max.addAll(temp);
            }
            temp.clear();
        }

        for(Character ch : max){
            System.out.println(ch);
        }
        System.out.println();

    }


}
