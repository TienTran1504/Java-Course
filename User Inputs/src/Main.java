import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What's your name ?");
        String name = scanner.nextLine();

        System.out.println(name);

        System.out.printf("Hello %s. How old are you?",name);

        //int age = scanner.nextInt();
        //scanner.nextLine(); // cleans up the input buffer

        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d is an excellent age to start programming. what language do you prefer?", age);

        String language = scanner.nextLine();

        System.out.printf("%s is a popular programming language", language);
        scanner.close();
    }
}