package switchStack;

import genericStack.MyGenericStack;

import java.util.Arrays;
import java.util.Stack;

public class MyStackClient {
    public static void reverseIntArray(int[] arr) {
        // 1. Khởi tạo một Stack rỗng kiểu Integer
        Stack<Integer> stack = new Stack<>();

        // 2. Lần lượt push các phần tử của mảng vào Stack
        for (int num : arr) {
            stack.push(num);
        }

        // 3. Lần lượt pop từ Stack và ghi đè lại vào mảng ban đầu
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }

    public static String ReverseString(String input) {
        if(input==null||input.trim().isEmpty()) return input;

        Stack<String> wStack = new Stack<>();

        String[] words = input.split(" ");
        for(String word : words){
            wStack.push(word);
        }
        StringBuilder output = new StringBuilder();
        while(!wStack.isEmpty()){
            String myWord = wStack.pop();
            output.append(myWord).append(" ");
        }
        return output.toString().trim();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        reverseIntArray(arr);

        System.out.println("Mảng sau khi đảo: " + Arrays.toString(arr));

        System.out.println("___________________________");
        String originalStr = "Học lập trình Java không khó";
        System.out.println("Chuỗi ban đầu: \"" + originalStr + "\"");

        String reversedStr = ReverseString(originalStr);

        System.out.println("Chuỗi sau khi đảo từ: \"" + reversedStr + "\"");


    }

}
