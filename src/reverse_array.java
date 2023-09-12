public class reverse_array {
    static int[] reverseArray(int []arr){
        int [] ans = new int[arr.length];
        int j =0 ;
        for (int i = arr.length-1 ; i>=0 ;i--){
            ans[j++] = arr[i];
        }
       return ans;
    }
    // reverse the string without using new array

    static String reverseString(String input){
        String inp = input;
        String output ="";

       for(int i = inp.length()-1 ; i>=0 ;i--){
           output+=inp.charAt(i);
       }
        return output;
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,8};
    /*  int ans[] = reverseArray(arr);
        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        } */
// System.out.println(reverseString("hi iam kailash"));
        
    }
}
