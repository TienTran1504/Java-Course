public class Lion extends Animal implements Loggable,Printable{
    public void eat(){
        System.out.println("Lion is eating...");
    }
    public void print(){
        System.out.println("Printing...");
    }
    public String message(){
        return "something";
    }

}
