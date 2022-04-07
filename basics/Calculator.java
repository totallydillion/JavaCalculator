import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {

        //creating a listener to the number
        Scanner userNumber = new Scanner(System.in);

        //asking the user for a number
        System.out.println("Please enter a number");

        //getting the number that the user has entered
        int number1 = userNumber.nextInt();

        //getting another listener to the number
        Scanner newNumber = new Scanner(System.in);

        //asking the user for another number
        System.out.println("Please enter another number");

        //getting the number that the user entered
        int number2 = newNumber.nextInt();
        
        //printing the results
        System.out.println(number1 + number2);

    }
}
