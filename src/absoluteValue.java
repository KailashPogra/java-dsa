// Q2 - Write a program to print absolute value of a number entered by the user.
// absolute means it cant be negative
import java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number <0){
            number = number*-1;
        }
        // absolute means it cant be minus
        System.out.println("absolute value is = "+number);


    }
}
