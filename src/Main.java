public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Yep");
        Animal dog = new Dog("Også yep");

        cat.makeSound();
        dog.makeSound();

        cat.eat("Mad");
        dog.eat("Mad");
    }
}
