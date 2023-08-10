
// write a program to print the value if it is devisible by 3 or 5

import java.util.Scanner;
public class conditional2 {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int A =  sc.nextInt();

        if (A%3==0 || A%5==0) {
            System.out.println(A +" devisible ");
        }else{
            System.out.println("not devisible ");
        }


    }
}
