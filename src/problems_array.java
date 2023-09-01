import java.util.Scanner;

public class problems_array {
    public static void main(String[] args) {
        //count the number of occurrences of a particular element x
        // ex. if x=5 then check how many times 5 is comes in array
        System.out.println("enter number");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int ans = 0 ;
        int []array = {1,2,2,3,4,5,3,5,4,5,2,5};

        for (int i = 0; i < array.length; i++) {
            if (array[i]==x){
                ans+=1;
            }
        }
        System.out.println(ans);
    }
}
