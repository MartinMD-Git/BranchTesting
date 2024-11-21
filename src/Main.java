public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Idi");
        Animal dog = new Dog("ot");



        cat.makeSound();
        dog.makeSound();

        System.out.println(cat.getName() + " spiser fisk: " + cat.eat("fisk"));
        System.out.println(dog.getName() + " spiser også fisk: " + dog.eat("fisk"));

        dog.showMood(true);
        dog.showMood(false);

        cat.showMood(true);
        cat.showMood(false);



    }
}
