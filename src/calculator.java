// - Create a calculator using switch statement to perform addition, subtraction, multiplication
//  and division.

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();
        System.out.println("Choose operation *,/,+.-");
        String operation  = sc.next();
        switch (operation){
            case "*" :
                System.out.println("Ans = "+firstNumber*secondNumber );
                break;
            case "/" :
                System.out.println("Ans = "+firstNumber/secondNumber );
                break;
            case "+" :
                System.out.println("Ans = "+firstNumber+secondNumber );
                break;
            case "-" :
                System.out.println("Ans = "+(firstNumber-secondNumber) );
                break;
            default:
                System.out.println("you enter wrong value");

        }
    }
}
