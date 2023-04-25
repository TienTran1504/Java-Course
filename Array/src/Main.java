import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        char vowels [] = new char[5];

        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'o';
        vowels[3] = 'i';
        vowels[4] = 'u';
        char vowels2[] = {'e', 'a', 'u', 'i', 'o'};
        System.out.println(vowels[4]);

        Arrays.sort(vowels2);
        int foundIndex= Arrays.binarySearch(vowels2,'o');
        int foundIndex2= Arrays.binarySearch(vowels2,1,4,'a');

        System.out.println(Arrays.toString(vowels2)); // [a, e, i, o, u]
        System.out.println(foundIndex); // 3
        System.out.println(foundIndex2); // -2

        Arrays.fill(vowels2,'x');
        System.out.println(Arrays.toString(vowels2));// [x,x,x,x,x]

        Arrays.fill(vowels2, 1,4,'y'); //  [x, y, y, y, x]

        System.out.println(Arrays.toString(vowels2));


        int numbers[] = {1,2,3,4,5};
        int copyOfNumbers[] = numbers;

        Arrays.fill(numbers,0);
        System.out.println(Arrays.toString(numbers)); //[0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(copyOfNumbers));// [0, 0, 0, 0, 0]

        Arrays.fill(copyOfNumbers,1);
        System.out.println(Arrays.toString(numbers)); //[1, 1, 1, 1, 1]
        System.out.println(Arrays.toString(copyOfNumbers));// [1, 1, 1, 1, 1]

        // To fix this references
        int numbers2[] = {1,2,3,4,5};
        int copyNoneRefNumbers[] = Arrays.copyOf(numbers2,numbers2.length); // [1,2,3,4,5]
//        int copyNoneRefNumbers[] = Arrays.copyOf(numbers2,10); // [1, 2, 3, 4, 5, 0, 0, 0, 0, 0]
//        int copyNoneRefNumbers[] = Arrays.copyOf(numbers2,2); // [1, 2]

        int copyRangeNumbers[] = Arrays.copyOfRange(numbers2,1,4);
        Arrays.fill(numbers2,0);

        System.out.println(Arrays.toString(numbers2)); //[0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(copyNoneRefNumbers));// [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(copyRangeNumbers));// [2, 3, 4]

    }
}