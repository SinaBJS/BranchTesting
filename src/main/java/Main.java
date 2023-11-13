public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Labrador");
        Cat cat1 = new Cat("Mis");

        dog1.makeSound();
        cat1.makeSound();

        cat1.eat("fish");
        dog1.eat("Dog Food");

        dog1.mood(true);
        dog1.mood(false);

        cat1.mood(true);
        cat1.mood(false);
    }
}
