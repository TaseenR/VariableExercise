package qa.practise.sky;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your firstname");
        String firstName = scanner.nextLine();
        System.out.println("Enter your lastname");
        String lastName = scanner.nextLine();
        System.out.println("Hello " +firstName + " " + lastName);
        System.out.println("Please input a number");
        int numOne = scanner.nextInt();
        System.out.println("Please input a number");
        int numTwo = scanner.nextInt();
        int sum = numOne + numTwo;
        System.out.println("Here is the sum: " + sum);
    }

}
