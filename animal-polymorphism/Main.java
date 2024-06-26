public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Max", 13, "White", "Australian Shepherd");
        Animal cat = new Cat("Mauritius", 3, "Black", "Pantone322");
        Animal duck = new Duck("Waddles", 1, "Yellow");

        dog.makeSound();
        cat.makeSound();
        duck.makeSound();
    }
}
