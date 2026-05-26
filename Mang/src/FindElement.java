import java.util.Random;

public class FindElement {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        int rows = matrix.length;
        int cols = matrix[0].length;

        Random rand = new Random();
        System.out.println("--- Ma trận 6x6 ngẫu nhiên ---");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                matrix[i][j] = rand.nextInt(99) + 1;

                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        int max = matrix[0][0];
        int indexcol = 1;
        int indexrow = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                    indexcol = j+1;
                    indexrow = i+1;

                }

            }


        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + indexcol + " ,at position " + indexrow);
    }
}
