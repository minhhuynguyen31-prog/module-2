package staticproperty;

public class car {
    private String name;
    private  String engine;
    public static int number;
    public car(String name,String engine){
        this.name=name;
        this.engine=engine;
        number++;
    }
}
