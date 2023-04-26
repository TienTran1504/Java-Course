public class Main {

    public static void main(String[] args) {
        String [] array  = {"one", "two", "three"};
        String [] copiedArray = array.clone();

        System.out.println(array == copiedArray);

        Dog dog1 = new Dog("Tien");
        Dog dog2 = dog1.clone();

        System.out.println(dog1 == dog2);

        dog2.sellTo("Ngoc");
        System.out.println(dog1.asString() +", " + dog2.asString());
    }
}