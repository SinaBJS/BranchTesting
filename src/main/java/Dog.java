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

    @Override
    public void mood(boolean mood) {
        if(mood==true){
            System.out.println("Logrer");
        }else
            System.out.println("Knurrer");
    }

    @Override
    public void jump(double distance) {
        System.out.println(name + " jumped " + distance + " meters");
    }
}
