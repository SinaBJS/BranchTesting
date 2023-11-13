public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
