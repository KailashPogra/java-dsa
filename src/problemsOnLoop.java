import java.util.Scanner;
public class problemsOnLoop {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter number ");
        int num = sc.nextInt();
       // count the number of digits for given number n
      int count = 0;
       while (num>0){
         num = num/10;
         count++;
       }
        System.out.println(count);
    }
}
