public class array_partetion {

    // check if we can partition the array into two subarrays with equal sum
    //more formally , check the prefix sum of array is equal to suffix sum of the array
    static int  ArraySum(int arr[]){
          int totleSum = 0 ;
        for (int i = 0; i < arr.length ; i++) {
           totleSum+=arr[i];
        }
        return totleSum;
    }
    static boolean equalsumPartation(int arr[]){
        int totlesum = ArraySum(arr);
        int prefixsum = 0;
        for (int i = 0; i <arr.length ; i++) {
            prefixsum = prefixsum+arr[i];
            int postfixsum = totlesum-prefixsum;
            if (prefixsum==postfixsum){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
     int arr[] = {1,3,5,6,2};
        System.out.println("equal partition possible : "+equalsumPartation(arr));
    }
}
