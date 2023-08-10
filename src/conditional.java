
// print odd if the input value is odd then even
import java.util.Scanner;
public class conditional {
    public static void main(String[] args) {
      // we use if else conditional operator for it
        Scanner sc = new Scanner(System.in);


            System.out.println("Enter number");
            int a = sc.nextInt();
            if (a%2==0){
                System.out.println("input is odd");
            } else {
                System.out.println("input is even");
        }
    }
}
