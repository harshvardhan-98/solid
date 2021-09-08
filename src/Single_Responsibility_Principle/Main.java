package Single_Responsibility_Principle;
import java.util.*;

//A class should have one and only one reason to change.

public class Main {
    public static void main(String[] args) {
        Calculator object = new Calculator();
        char option;
        int a, b;
        Scanner scannerObject = new Scanner(System.in);
        while(true)
        {

            System.out.println("Please press");
            System.out.println(" '+' : For Addition");
            System.out.println(" '-' : For Subtraction");
            System.out.println(" '*' : For Multiplication");
            System.out.println(" '/' : For Division");
            System.out.println(" '!' : To exit the Calculator");
            System.out.println("Enter the choice");
            option = (scannerObject.next()).charAt(0);
            if(option == '!') {

                System.out.println("Calculator closed");
                return;
            }
            System.out.println("Enter your first number:");
            a = scannerObject.nextInt();
            System.out.println("Now enter your second number:");
            b = scannerObject.nextInt();

            switch (option) {
                case '+':
                    System.out.println("The result of Addition is = " + object.add(a,b) + "\n\n");
                    break;
                case '-':
                    System.out.println("The result of Subtraction is = " + object.subtract(a,b) + "\n\n");
                    break;
                case '*':
                    System.out.println("The result of Multiplication is = " + object.multiply(a,b) + "\n\n");
                    break;
                case '/':
                    System.out.println("The result of Division is = " + object.divide((double)a, (double)b)+"\n\n");
                    break;
                default:
                    System.out.println("Incorrect Choice! Re-enter again\n\n");
            }
        }
    }
}
