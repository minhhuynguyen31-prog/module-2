package Resizeable;

import java.util.Random;

public class TestResizeable {
    public static void main(String[] args) {
        Random rand = new Random();
        Shape[] shape = new Shape[3];
        shape[0] = new Rectangle(1.4,5.3, "red", true);
        shape[1] = new Circle(2.6,"yellow",false);
        shape[2] = new Rectangle(3.6,1.8, "blue", true);


        System.out.println("tang kich thuoc");

        for(int j=0;j<shape.length;j++){
            Shape shapeds = shape[j];

            double areabefore = shapeds.getArea();

            int ngaunhien= rand.nextInt(100)+1 ;

            shapeds.phongTo(ngaunhien);
            double areaafter = shapeds.getArea();

            System.out.printf("Phần tử thứ %d", (j + 1));
            System.out.printf("  - Tỉ lệ phóng to kích thước: %d%%\n", ngaunhien);
            System.out.printf("  - Diện tích TRƯỚC khi tăng:  %.2f\n", areabefore);
            System.out.printf("  - Diện tích SAU khi tăng:   %.2f\n", areaafter);
            System.out.println("-------------------------------------------------");
        }
    }
}
