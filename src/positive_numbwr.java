

//Write a program to print positive number entered by the user, if user enters a negative
//number, it is skipped
import java.util.Scanner;
public class positive_numbwr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int number = sc.nextInt();
        if (number>=0){
            System.out.println("number is"+ number);
        } else {
            System.out.println("The number is negative and skipped");
        }
    }
}
