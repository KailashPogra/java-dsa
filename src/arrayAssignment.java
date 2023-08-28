import java.util.Arrays;

public class arrayAssignment {
    public static void main(String[] args) {
    /*   // Q1. Given an array of integers {2, 6, -5, -1, 0, 4, -9},
        // print only the positive values present in the array.

        int arr[] = {2,6,-5,-1,0,4,-9};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=0){
                System.out.println(arr[i]);
            }
        } */
    /*Q2. Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”}
 // into an array of strings and print all strings stored on odd indices of the array.
String[]arr = {"ab","bc","cd","de","ef","fg","gh"};
        for (int i = 0; i < arr.length ; i++) {
            if (i==0){
               continue;
            }
            else if (i%2==0){
                System.out.println(arr[i]);
            }
        } */
    /*  Q3. Traverse over the elements of the array {1,2,3,4,5,6,7,8}
//  using for each loop and print all evenelements.
      int arr[] = {1,2,3,4,5,6,7,8};
      for(int x :arr){
          if (x%2==0){
              System.out.println(x);
          }
      } */
    /* Q4. Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4}
// using standard library method for calculating the minimum element.
        int arr[]={2, -3, 5, 8, 1, 0, -4};
        System.out.println(Arrays.stream(arr).min());*/
   /*Q5. Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0}
   //Peak element is the one which is greater than
   //its immediate left neighbor and its immediate right neighbor.
   //Leftmost and rightmost element cannot be a peak element.
          int arr[] = {1, 1, 3, 4, 2, 3, 5, 7, 0};
        for (int i = 1; i < arr.length-1 ; i++) {
            if (arr[i]>arr[i-1]&& arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        } */

    }
}
