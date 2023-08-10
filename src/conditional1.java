
// write a program to devide peopleinto 3 age groups depanding upon their age group
//below 12 = child ; between 12,18 = teenager ; above 18 = adult
import java.util.Scanner;
public class conditional1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter age");
        int age = sc.nextInt();

        if (age<12){
            System.out.println("child");

        } else if (age>12 && age<18) {
            System.out.println("teenagers");
        } else {
            System.out.println("adult");
        }

    }
}
