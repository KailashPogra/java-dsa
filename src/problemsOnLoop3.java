import java.util.Scanner;
public class problemsOnLoop3 {
    public static void main(String[] args) {
        // print rectangular pattern using loop
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows");
       int row = sc.nextInt();
//   System.out.println("enter the number of column");
//   int column = sc.nextInt();

//     for (int i = 1 ; i<=row ; i++){
//         for (int j = 1 ; j<=column;j++){
//             System.out.print("*");
//         }
//         // this is for  new line
//         System.out.println();
//     }
//        for (int i = 1 ; i<=row ; i++){
//            for (int j = 1 ; j<=column ; j++){
//                if(i==1 || i==row || j==1 || j==column){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }

    //print the triangular pattern
//        for (int i = 1 ; i<=row ; i++){
//            for (int j = 1 ; j<=i ; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//      }

        //print reverse triangular

//        for (int i = 1; i <= row ; i++) {
//            for (int j = i; j <=row; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // print pyramid pattern

//        for (int i = 1 ; i<=row ; i++){ // traversing over rows
//
//            //print row-i space
//            for (int j = 1 ;j<=row-i ; j++){
//                System.out.print(" ");
//            }
//            //print 2*i-1
//            for (int k = 1; k <=2*i-1 ; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //print numerical pattern
//        for (int i = 1; i <=row ; i++) {
//            for (int j = i; j <=row ; j++) {
//                System.out.print(j);
//            }
//         for (int k = 1; k<=i-1 ; k++){
//             System.out.print(k);
//         }
//            System.out.println();
//        }

        //print 1 to 6 in rectangular 6 row and 6 column

//        for (int i = 1; i <=6 ; i++) {
//            for (int j = 1; j <=6 ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        // print more logic
//
//        for (int i = 1; i <=5 ; i++) {
//            for (int j = 1; j <=5 ; j++) {
//
//                if ((i+j)%2==0){
//                    System.out.print(1);
//                }else {
//                    System.out.print(2);
//                }
//
//            }
//            System.out.println();
//        }
        // numerical triangular pattern

//        for (int i = 1; i <=row; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // print numerical pyramid pattern

//        for (int i = 1; i <=row ; i++) {
//            // printing space
//            for (int j = i; j <=row ; j++) {
//                System.out.print(" ");
//            }
//            // printing 1 to i
//            for (int k=1 ;k<=i ; k++){
//                System.out.print(k);
//            }
//            for (int l=i-1 ; l>=1 ; l--){
//                System.out.print(l);
//            }
//            System.out.println();
//        }

        //print numerical hologram pattern

//        for (int i =1 ; i<=row ; i++){
//            // printing space
//            for (int j = i; j <=row ; j++) {
//                System.out.print(" ");
//            }
//            // logic
//            for (int k = i+1; k <=2*i ; k++) {
//               if (k==1){
//
//               }
//            }
//            System.out.println();
//        }



    }
}
