public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + ": Woof");

    }

    @Override
    public void showMood(boolean glad) {
        if(glad) {
            System.out.println("Hunden logrer");
        }else{
            System.out.println("Hunden knorrer");
        }
    }


    @Override
    public boolean eat(String foodType) {
        return true;
    }
}
