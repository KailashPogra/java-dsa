public class rotate_array {
    static int [] rotate (int arr[] , int k){
        int n = arr.length;
        // remember thing is k%n
        k = k%n;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n-k ;i<n ;i++){
          ans[j++]=arr[i];
        }
        for (int i = 0; i <n-k ; i++) {
            ans[j++]=arr[i];
        }
        return ans;
    }
    public static void main(String[] args) {

   int arr[] = {1,2,3,4,5,6};
     int[] ans = rotate(arr,2);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
}
