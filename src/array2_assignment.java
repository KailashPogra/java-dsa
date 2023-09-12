public class array2_assignment {


    static void swap(int arr[],int i,int j){
         int temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
    }
    static void reverse(int arr[]){
        int i = 0 ; int j = arr.length-1;
        while (i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
public static void main(String[] args) {
    /*Q1. Given an array arr[] of size n, find the first repeating element.
// The element should occur more than once and the index of its first occurrence should be the smallest.
// If no repeating element exists, print -1.
    int arr[] = {1,2,3,4,3,2,1};
   int ans = -1;
    for (int i = 0; i <arr.length ; i++) {
        for (int j = 0; j <arr.length ; j++) {
            if(arr[i]==arr[j]){
                ans = arr[i];
            }
        }
    }
    System.out.println(ans); */

 int arr[] = {1,2,3,4,5};
reverse(arr);
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}
