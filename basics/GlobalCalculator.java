import java.util.Scanner;

public class GlobalCalculator {
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
        
        System.out.println("Please enter a symbol");
        
        Scanner symbol = new Scanner(System.in);
        
        String expressionSymbol = symbol.next();
        
        switch(expressionSymbol){
            case "+":
            System.out.println(number1 + "+"+ number2 + "=" + (number1 + number2));
            break;
            case "-":
            System.out.println(number1 + "-"+ number2 + "=" + (number1 - number2));
            break;
            case "*":
            System.out.println(number1 + "*"+ number2 + "=" + (number1 * number2));
            break;
            case "/":
            System.out.println(number1 + "/"+ number2 + "=" + (number1 / number2));
            break;
            case "%":
            System.out.println(number1 + "%"+ number2 + "=" + (number1 %number2));
            break;
            case "^":
            System.out.println(number1 + "^"+ number2 + "=" + (number1 ^ number2));
            break;
            
            default:
            System.out.println("That is not a valid symbol, Restarting.");
            break;
        }
        return;
    }
}
