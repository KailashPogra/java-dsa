import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal num");
        int decimal_num= sc.nextInt();

        int ans = 0;
        int first_iteration = 1;
        while (decimal_num>0){
            int parity = decimal_num%2;
            ans+=parity*first_iteration;
            first_iteration*=10;
            decimal_num/=2;
        }
        System.out.println("binary num is "+ans);
    }
}
