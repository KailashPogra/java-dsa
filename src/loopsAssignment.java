
   import java.util.Scanner;
    public class loopsAssignment {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
/* Write a program to print Fibonacci series of n terms where n is input by user.
            int n = scn.nextInt();
            int a = 1; //initial 2 elements are 1 and 1
            int b = 1;
            for(int i = 1; i <= n; i++){
                System.out.print(a + " ");
                int sum = a+b; //calculating every 3rd element in the series by summing up previous 2
                a = b; //update previous element to next element
                b = sum;//update b to newly created next element

         */

/*Q2 - Write a program to enter the numbers till the user wants, the number can be positive,
negative or zero. Calculate the sum of numbers until a negative number is encountered.
If the input is a negative number, current sum is discarded and print -1.
            int sum = 0;
            while(scn.hasNextInt()){ //check if input exists or not
                int num = scn.nextInt();
                if(num >= 0){ //if input is positive or zero add it to the current sum
                    sum += num;
                }
                else{
                    sum = -1;//input is negative so change sum to -1 and break out of the loop
                    break;
                }
            }
            System.out.print(sum); */

/* Q3- Write a program to calculate the factorial of a number.
            int n = scn.nextInt();
            int ans = 1; //initialize with 1 as factorial of 0 and 1 both is 1
            for(int i = 2; i <= n; i++){
                ans *= i; //keep multiplying numbers in the current product till you reach n
            }
            System.out.println(ans); */

/* Q4- Write a program to print all Armstrong numbers between 1 to n.

            int n = scn.nextInt();
            int num = 1; //variable that will check for each number starting from 1 till n
            while(num <= n) {
                int count = 0;
                int i = num;
                while (i > 0) {
                    count++;
                    i /= 10;
                }
                int val = num; //store value of current num in a temporary variable to calculate sum
                //of its digits
                int sum = 0;
                while (val > 0) { //break the number digit by digit until it reaches 0
                    int digit = val % 10;
                    sum += Math.pow(digit, count);//add cube of digit to sum
                    val /= 10;
                    if (sum > val) { //if sum has exceeded our current number, there is no way for it
                        //   to be an Armstrong number
                        continue;
                    }
                }
                if (sum == num) { //this is an armstrong number
                    System.out.println(num);
                }
                num++;
            } */

/*Q5 – Write a program to print the cross pattern given below (in the shape of X):

  int size = 6; //length of pattern
       for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
  if(i == j || i+j == size-1){ //consider a rectangle, we need to print stars where both diagonals are present
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            } */

/* Q6- Write a program to print alphabet diamond pattern:
            int size = 5; //length of pattern is 5 only, the below part is the upside down version of top part with 5th line in the middle, with total of (2n-1) lines
            int alpha = 65; //ASCII code for first capital letter
            int num = 0; //will increment alpha as char progresses
            for (int i = 1; i <= size; i++) {
                for (int j = size; j > i; j--) {
                    System.out.print(" "); //top half until the spaces need to be printed
                }
                for (int k = 0; k < i * 2 - 1; k++) {
                    System.out.print((char)(alpha+num++));//top half until the char need to be printed, next char can be achieved by incrementing the ASCII code by 1
                }
                num = 0;
                System.out.println();
            }
            for (int i = 1; i <= size - 1; i++) {
                for (int j = 0; j < i; j++) { //bottom half
                    System.out.print(" ");
                }
                for (int k = (size - i) * 2 - 1; k > 0; k--) {
                    System.out.print((char)(alpha+num++));
                }
                num = 0;
                System.out.println();
            } */

/* int size = 5;
            for(int i = 0; i < size; i++){ //representing columns
                for(int j = 0; j < size; j++){//representing rows
                    if(i == size/2){ //middle column
                        System.out.print("*");
                    }else{
                        if(j == size/2){ //middle row
                            System.out.print("*");
                        }else{
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            } */




        }
}
