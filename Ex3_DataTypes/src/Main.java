public class Main {

    public static void main(String[] args) {
        // integer types
        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32768 to 32767
        int anInteger = 2147483647; // -2147483647 to 2147483647
        long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

        //decimal types
        double aDouble = 1.7912312; // 4.9E -324 to 1.7976931348623157E308
        float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38

        //booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        //characters
        char copyrightSymbol = '\u00A9'; // this character is: ©

        System.out.println("This is the copyright symbol: " + copyrightSymbol);


        int number1 = 5;
        double number2 = number1;

        System.out.println(number2); // 5.0

        double number3 = 5.8;
        // int number4 = number3; // will be error
        int number4 = (int) number3; // fix it
        System.out.println(number4); // -> 5

    }
}