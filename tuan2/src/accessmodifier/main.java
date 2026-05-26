package accessmodifier;

public class main {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"Hoang");
        Student s2 = new Student(222,"Khan");
        Student s3 = new Student(333,"nam");

        s1.display();
        s2.display();
        s3.display();

    }
}
