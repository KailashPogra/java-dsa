import java.util.Scanner;

public class problems_array8 {
    // find the second maximum value
    static int maximum (int arr[]){
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>mx){
               mx = arr[i];
            }
        }
        return mx;
    }
    static int secondmax(int arr[]){

        int mx = maximum(arr);

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmax = maximum(arr);
        return secondmax;
    }
    //find the unique number in array where all the elements are being repeated twice
    // with one value being unique
    static int unique(int arr[]){
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
          ans= arr[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = sc.nextInt();
        int arr[] =  new int[n];
        System.out.println("enter element of array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
      //  System.out.println("unique number is = "+unique(arr));
        System.out.println(secondmax(arr));
    }
}
