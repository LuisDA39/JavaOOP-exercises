public class Cat extends Animal {
    String eyeColor;

    public Cat(String name, int age, String color, String eyeColor) {
        super(name, age, color);
        this.eyeColor = eyeColor;
    }

    @Override
    void makeSound() {
        System.out.println("meow");
    }
}
