import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking array as input
     int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            int x = sc.nextInt();
            arr[i] = x ;
        }
        // printing array
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]);
        }
    }
}
