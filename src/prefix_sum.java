public class prefix_sum {

    static void printArraty(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    // find prefix sum
    static int [] prefixSum(int arr[]){
        int pref[] = new int[arr.length];
        pref[0] = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            pref[i] = pref[i-1]+arr[i];
        }
        return pref;
    }

    // find prefix sym without using new array
    static int [] prefixsum_2(int arr[]){
        for (int i = 1; i < arr.length ; i++) {
            arr[i] = arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
     int pref[] =  prefixsum_2(arr);
      printArraty(pref);
    }
}
