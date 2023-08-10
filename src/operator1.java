// Q2 - Swap two numbers without the use of third variable.
import java.util.Scanner;
public class operator1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int x = sc.nextInt();
        System.out.println("enter second number");
        int y = sc.nextInt();       
        
        x = x+y; //15
        y = x-y; // 15-5 = 10
        x = x-y; // 15-10 =5

         System.out.println(x);
         System.out.println(y);
    }
}
