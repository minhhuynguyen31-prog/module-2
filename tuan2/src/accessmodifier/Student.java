package accessmodifier;

public class Student {
    private int rollno;
    private String name;
    private static  String college = "bbdit";

    Student(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "code gym";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}
