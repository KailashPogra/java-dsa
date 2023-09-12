public class problems_array9 {
    // given an array 'a' consisting of integers. return the fix value that is repeating in array
    // if no value is being repeated , return -1
    public static void main(String[] args) {
            int arr[] = {2,2,4,5,6,3};
            int ans = -1 ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    ans = arr[i];
                }
            }
        }
        System.out.println(ans);
    }
}
