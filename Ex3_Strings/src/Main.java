import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String literalString1 ="abc";
        String literalString2 = "abc";

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        System.out.println(literalString1==literalString2); // true because its literal string
        System.out.println(objectString1==objectString2); // false because it compares with 2 diffrent object


        String name = "Tien Bieber"; // %s
        String country = "VN"; // %s
        int age = 26 ; // %d
        String company = "freecodeCamp"; // %s
        double gpa = 3.4; //%f
        char percent = '%'; // %c
        boolean truth = false; // %b
        String formattedString = String.format(
                "My name is %s. I'm from %s. I'm %d years old. I work for %s. My GPA is %f. I have attended 100%c of my classes. These are all %b claims"
                , name,country,age,company, gpa,percent, truth);

        System.out.println(formattedString);

        String string1 = new String("abc");
        String string2 = new String("ABC");

        System.out.println(string1.equals(string2)); // false
        System.out.println(string1.equalsIgnoreCase(string2)); // true

        String test = "The Sky is blue";
        System.out.println(test.replace("blue","red")); // The Sky is red
        System.out.println(test); // The Sky is blue

        System.out.println(test.contains("sky")); // false


    }
}