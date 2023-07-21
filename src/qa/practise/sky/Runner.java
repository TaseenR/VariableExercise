package qa.practise.sky;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number");
        int numOne = scanner.nextInt();
        System.out.println("Please input a number");
        int numTwo = scanner.nextInt();

        if (numOne > numTwo) {
            System.out.println(numOne);
        } else if (numTwo > numOne) {
            System.out.println(numTwo);
        } else {
            System.out.println("They are indeed equal");
        }

        System.out.println("Please input a number");
        int numThree = scanner.nextInt();
        if (numThree%2 == 0) {
            System.out.println("This is a even number");
        } else {
            System.out.println("This is odd");
        }

        System.out.println("Give me a traffic light colour (Green or Red)");
        String light = scanner.next();
        if (light.equals("Red")) {
            System.out.println("This means stop");
        } else {
            System.out.println("This means go"); //This was me being a lazy coder sorry.
        }
    }

}
