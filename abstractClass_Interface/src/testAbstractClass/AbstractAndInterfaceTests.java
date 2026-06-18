package testAbstractClass;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chiken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoeat());
        }
    }
}
