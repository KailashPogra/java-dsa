import java.util.Scanner;
public class loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 // print the sum of n natural numbers , where n is the input
//        System.out.println("enter number");
//        int n = sc.nextInt();
//        int i = 1;
//        int sum = 0;
//        while (i<=n){
//            System.out.println(i);
//            sum = sum +i;
//            i++;
//        }
//        System.out.println("sum of n natural number is "+ sum);

        // break and continue

        // print the first multiple of 5 which is also a multiple of 7

//        for (int i = 1 ;;i++){
//            if (i%5==0 && i%7==0){
//                System.out.println("found the first multiple is  "+ i);
//               break;
//            }

        // solving by while loop
//        int i = 1 ;
//        while (true){
//            if (i%5==0 && i%7==0){
//                System.out.println("found the first multiple is  "+ i);
//                break;
//            }
//            i++;
//        }


        // continue keyword
        // in this we can skip a required iteration and move to next iteration
        // print all the value 1 to 50 except for the multiple of 3
        for (int i =1 ; i<=50 ; i++){

            if (i%3==0){
                continue;
            }
            System.out.println(i);
        }

    }

}
