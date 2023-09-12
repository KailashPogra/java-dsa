import java.util.Scanner;

public class prefix_sum2 {

    static void printArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    // give an array size of n . ans 'q' queries where you need to print the sum of values
    // in a given range of 'l' to 'r' 
    //note:- the value of 'l' and 'r' follow 1 based indexing
    static int[] prefix(int []arr){

        for (int i =1 ; i <arr.length ; i++) {
              arr[i] = arr[i]+arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size");

        int n = sc.nextInt();

        int arr [] = new int[n+1];

        for (int i = 1; i <=n ; i++) {
            System.out.println("enter element");
            arr[i] = sc.nextInt();
        }

        int pref [] = prefix(arr);

        System.out.println("enter number of queries");
        int q = sc.nextInt();
        while (q>=1){
            System.out.println("enter range ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = pref[r]-pref[l-1];
            System.out.println(ans);
            q--;
        }

    }

}