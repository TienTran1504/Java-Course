public class Dog implements Cloneable {
    private String ownersName;
    public Dog(String ownersName){
        this.ownersName=ownersName;
    }
    public void sellTo(String name){
        this.ownersName = name;
    }
    public String asString(){
        return "Dog of " + this.ownersName;
    }
    @Override
    public Dog clone(){
        try {
            return (Dog) super.clone();
        }catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
