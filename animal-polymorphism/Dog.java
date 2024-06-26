public class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String color, String breed) {
        super(name, age, color);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("woof");
    }
}
