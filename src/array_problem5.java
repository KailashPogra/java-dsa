public class array_problem5 {
    public static void main(String[] args) {
        //find the total number of pairs in array whose sum is equal to given number X;
        int x = 7;
   int arr[] = {4,6,3,5,8,2,};
   int ans = 0 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==x){
                    ans++;
                }
            }
        }
        System.out.println("total number of pairs is = "+ans);
    }
}
