public class array_problem7 {
    public static void main(String[] args) {
        // find the number of triplet whose sum is equal to given number X
        int x = 12;
        int ans = 0;
        int arr[] ={4,6,3,5,8,2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i]+arr[j]+arr[k]==x){
                        ans++;
                    }
                }
            }
        }
        System.out.println("number of triplet is = "+ans);
    }
}
