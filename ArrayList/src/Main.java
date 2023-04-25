import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //ArrayList
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // just use reference types: Integer, Double, Float, Boolean

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        numbers.remove(2); // remove index 2
        numbers.remove(Integer.valueOf(4));// remove value 4
        numbers.set(2,Integer.valueOf(30));
        System.out.println(numbers.toString());

        ArrayList<Integer> UnsortedNumbers = new ArrayList<>();

        UnsortedNumbers.add(5);
        UnsortedNumbers.add(3);
        UnsortedNumbers.add(2);
        UnsortedNumbers.add(1);
        UnsortedNumbers.add(4);

        UnsortedNumbers.sort(Comparator.naturalOrder());

        System.out.println(UnsortedNumbers.toString());

        UnsortedNumbers.sort(Comparator.reverseOrder());

        System.out.println(UnsortedNumbers.toString());

        UnsortedNumbers.forEach(number -> {
            System.out.println(number*2);
            UnsortedNumbers.set(UnsortedNumbers.indexOf(number),number*2);

        });
        System.out.println(UnsortedNumbers.toString());

        //HashMap

        HashMap<String,Integer> examScores = new HashMap<String,Integer>();

        examScores.put("Math",75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Computer", 100);
        examScores.put("Bengali", 100);

        examScores.putIfAbsent("Math",70);// if Math does not exist it will put it
        examScores.replace("Math",60); // replace Math value to 60
        System.out.println(examScores.toString()); //{English=95, Bengali=100, Sociology=85, Computer=100, Math=75}

        System.out.println(examScores.get("English"));// 95
        System.out.println(examScores.get("Literature"));// null
        System.out.println(examScores.getOrDefault("Religion",-1));// -1

        System.out.println(examScores.size());
        examScores.remove("Sociology");

        System.out.println(examScores.containsValue(100)); // true
        //System.out.println(examScores.containsValue(Integer.valueOf(100)));//true

        examScores.forEach((subject,score) ->{
            System.out.println(subject + " - " + score);
        }); /* English - 95
        Bengali - 100
        Computer - 100
        Math - 60   */

        examScores.forEach((subject,score) ->{
            examScores.replace(subject,score - 10);
        });


        System.out.println(examScores.toString()); //{English=95, Bengali=100, Computer=100, Math=60}
        examScores.clear(); // clear Hashmap
        System.out.println(examScores.toString());
        System.out.println(examScores.isEmpty()); // true

    }
}