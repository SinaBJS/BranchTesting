public abstract class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    public abstract boolean eat(String foodType);

    public abstract void mood(boolean mood);

    public abstract void jump(double distance);
}
