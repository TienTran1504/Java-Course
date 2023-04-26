public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal[] animals = {new Dog(), new Gorilla(), new Tiger(), new Lion()};
        zoo.feedAnimals(animals);
        System.out.println("Hello world!");
    }
}