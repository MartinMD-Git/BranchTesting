public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Idi");
        Animal dog = new Dog("ot");



        cat.makeSound();
        dog.makeSound();

        cat.eat("Mad");
        dog.eat("Mad");
    }
}
