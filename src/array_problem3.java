public class array_problem3 {
    public static void main(String[] args) {
        //count the number of element strictly greater than x
        //ex. if x=2 then number>1
        int x = 4;
        int arr[]= {1,5,5,2,3,6,8,9};
        int ans = 0 ;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]>x){
                ans+=1;
            }
        }
        System.out.println(ans);
    }
}
