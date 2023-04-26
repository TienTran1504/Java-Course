public class BMW implements Car, Asset, Property{
    public void drive(){
        System.out.println("BMW driving ...");
    }
    public  int value(){
        return 80000;
    }
    public String owner(){
        return "Name";
    }
}
