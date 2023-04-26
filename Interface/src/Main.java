public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.drive();
        String owner = bmw.owner();
        int value = bmw.value();

        Car bmw2 = new BMW();
        bmw.drive();

        Car[] cars ={new BMW(), new Porsche(),};
        for (Car car : cars){
            car.drive();
        }

        System.out.println(owner +
                value);
        System.out.println("Hello world!");
    }
}