package access_modifier_training2;

public class Student {
    private String name = "john";
    private String classes = "c02";

    public  Student() {

    }
    

    public void setName(String name) {
        this.name = name;
    }
    public void setClasses(String classes) {
        this.classes = classes;
    }
    @Override
    public String toString() {
        return "Name: " + this.name + ", Class: " + this.classes;
    }
}
