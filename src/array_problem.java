import java.util.Scanner;

public class array_problem {
    // check the element is present in array or not
    static  int [] makeFrequancy(int[]arr){
        int freq[] = new int[100005];
        for (int i = 0; i < arr.length; i++) {
          freq[arr[i]]=freq[arr[i]]+1;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = {1,2,3,4,5,6};
        int freq [] = makeFrequancy(arr);
        int q =5;
        while (q>0){
            int val = sc.nextInt();
          if(freq[val]>0){
              System.out.println("YES");
          }
          else {
              System.out.println("NO");
          }
          q--;
        }
    }
}
