import java.util.Scanner;
public class loops {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        // print the sum of n natural numbers , where n is the input
        int sum = 0;
        int i = 0;
            while(i<n){
                i++;
                sum=sum+i;

            }
        System.out.println(sum);

// solve same question using for loop
//        int sum = 0;
//        for (int num = 0 ;num<=n; num++){
//            sum = sum+num;
//            // num++ is happen just before last semicolon
//        }
//        System.out.println(sum);

 // print the input number in reverse order
//
//        for (int i=n ; i>=1; i-- ){
//            System.out.println(i);
//        }

        // do while loop
        //in this loop first iteration always execute then it check condition
        //in this example we can see the condition is false, but it prints num 1 time
//       int num = 1;
//        do {
//            System.out.println(num);
//            num++;
//        }while (num<=0);
    }
}
