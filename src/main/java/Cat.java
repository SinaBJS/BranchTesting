public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miaw");
    }

    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void mood(boolean mood) {
        if(mood==true){
            System.out.println("Spinder");
        }else {
            System.out.println("Hvæser");
        }
    }
}
