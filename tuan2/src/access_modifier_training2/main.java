package access_modifier_training2;

public class main {
    public static void main(String[] args) {

                Student student = new Student();

                System.out.println("--- Thông tin ban đầu ---");
                // Cách 1: Gọi tường minh (giống display)
                System.out.println(student);

                student.setName("Alex");
                student.setClasses("C0526G1");

                System.out.println("\n--- Thông tin sau khi thay đổi ---");
                // Cách 2: Ngắn gọn nhất, Java tự hiểu và tự gọi toString() ngầm định
                System.out.println(student);
            }
        }


