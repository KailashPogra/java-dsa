import java.util.Arrays;

public class array_problem4 {
    // find smallest and largest element in array
    static int[] smallestAndLargest(int[]arry){
        Arrays.sort(arry);
        int[]index = {arry[0],arry[arry.length-1]};
        return index;
    }
    // check the given array is sorted or not
    static  boolean sortedArr(int []arr){
        boolean ans = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]<arr[i-1]) {
                ans=false;
                break;
            }
        }
        return ans ;
    }

    public static void main(String[] args) {

       // System.out.println( sortedArr(new int[]{2,4,4,5,6,7,8}));
      int[] ans = smallestAndLargest(new int[]{2,4,3,5,4,6,5,8,6,8});
        System.out.println(ans[0]);
        System.out.println(ans[1]);
    }
}
