package hashMap_hashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student S1 = new Student("nam", 20,"Hn");
        Student S2 = new Student("hung", 21, "HN");
        Student s3 = new Student("ha", 22, "HN");

        Map<Student,Integer> map = new HashMap<Student,Integer>();
        map.put(S1,1);
        map.put(S2,2);
        map.put(s3,3);
        map.put(S1,4);

        for( Map.Entry<Student,Integer> student : map.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("............Set");
        Set<Student> students = new HashSet<Student>();
        students.add(S1);
        students.add(S2);
        students.add(s3);
        students.add(S1);

        for( Student student : students){
            System.out.println(student.toString());
        }
    }
}
