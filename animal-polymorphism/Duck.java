public class Duck extends Animal {
    public Duck(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void makeSound() {
        System.out.println("quack");
    }
}
