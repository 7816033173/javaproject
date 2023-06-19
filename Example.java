import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfQuestions = 0;
        System.out.println("what is your name");
        String name = scanner.nextLine();
        noOfQuestions++;
        System.out.println("what is your phone number");
        long phone = scanner.nextLong();
        noOfQuestions++;
        System.out.println("your Graduation Percentage?");
        double percentage = scanner.nextDouble();
        noOfQuestions++;
        System.out.println("congratulations you have successfully answered " + noOfQuestions + " questions");
        System.out.println("your name is " + name);
        System.out.println("your phone number is " + phone);
        System.out.println("your Graduation percentage is " + percentage);


        scanner.close();
        
    }
}