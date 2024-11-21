public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Meow");
    }

    @Override
    public void showMood(boolean glad) {
        if(glad) {
            System.out.println("Katten spinder");
        }else{
            System.out.println("Katten hvæser");
        }
    }



    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
