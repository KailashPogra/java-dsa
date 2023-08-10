
//Write a program which takes the values of length and breadth from user and check if it is
 //       a square or not.
import java.util.Scanner;
public class problemConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length");
        int length = sc.nextInt();
        System.out.println("enter breadth");
        int breadth = sc.nextInt();
        if(length==breadth){
            System.out.println("it is a square");
        }else {
            System.out.println("it is not a square");
        }
    }
}
