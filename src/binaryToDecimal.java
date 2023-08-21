import java.util.Scanner;
public class binaryToDecimal {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("enter binary number ");
     int binary_num = sc.nextInt();

     int ans = 0;
     int first_condition = 1 ;
     while (binary_num>0){
         int extract_last_digit = binary_num%10;
            ans +=extract_last_digit*first_condition;
            first_condition*=2;
         //loop condition
         binary_num /=10;
     }
        System.out.println("decimal number is = "+ans);
    }
}
