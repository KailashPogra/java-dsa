import java.util.Scanner;
public class problemsOnLoop2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // find the sum of digit
        System.out.println("enter digit");
//        int digit = sc.nextInt();
//        int sum = 0;
//        while (digit>0){
//            sum=sum+digit%10;
//            digit=digit/10;
//        }
//        System.out.println("the sum of digit is = "+sum);

        // reverse the digit of number

//       int n = sc.nextInt();
//       int reverse=0;
//      while (n>0){
//          reverse=reverse*10+n%10;
//          n=n/10;
//      }
//        System.out.println(reverse);

 // find the sum of this series
        // s = 1-2+3-4+5-6+n
        // we know that in this series even subtract and odd add

//        int n = sc.nextInt();
//        int sum =0;
//        for (int i=1 ; i<=n ; i++){
//            if (i%2==0){
//                sum = sum-i;
//            }else {
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum);

        // print first n factorial
        // for example if num=3 then find factorial of 1,2,3;
        // point need to note is to not initialize the value of variable with 0 ;
//        int n = sc.nextInt();
//        int fact = 1;
//        for (int i = 1 ; i<=n ; i++){
//            fact = fact*i;
//            System.out.println("factorial of "+i+" is: "+fact);
//        }

        // given 2 number a and b find a raised to power b
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 1;
        for (int i=1 ; i<=b ; i++){
            ans = ans*a;
        }
        System.out.println(ans);
    }
}
