
import java.util.*;

public class Calculator
{

    static double calculate(double firstNumber, double secondNumber, char operator) 
    {
        if (operator == '+')
            return firstNumber + secondNumber;
        else if (operator == '-')
            return firstNumber - secondNumber;
        else if (operator == '*')
            return firstNumber * secondNumber;
        else
            return firstNumber / secondNumber;
    }

    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        if (operator == '/' && secondNumber == 0) 
        {
            System.out.println("Cannot divide by zero");
        } 
        else 
        {
            System.out.println("Result: " + calculate(firstNumber, secondNumber, operator));
        }

        scanner.close();
    }
}