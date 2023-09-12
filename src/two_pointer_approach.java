public class two_pointer_approach {
 // sort an array consisting only 0's and 1's
//    static  void sortZerosAndOne(int arr[]){
//      int n = arr.length;
//      int zeros = 0 ;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]==0){
//                zeros++;
//            }
//        }
//        for (int i = 0 ; i<n; i++){
//           if (i<zeros){
//             arr[i] = 0;
//           }else {
//               arr[i]=1;
//           }
//        }
  //  }

    //second approach

    static void swap(int arr[],int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
   /* static  void sortZeroAndOne(int arr[]){
        int left = 0 ; int right = arr.length-1;
        while (left<right){
            if (arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
           if (arr[left]==0){
               left++;
           }
           if (arr[right]==1){
               right--;
           }
        }
    } */

    /* given an integer array 'a' move the all even at the bigning of the array and move all odd at
    // the end of ARRAY note:- sequence does not matter
     static void evenodd(int arr[]){
         int left = 0 ; int right = arr.length-1;
         while (left<right){

             if (arr[left]%2==1 && arr[right]%2==0){
                 swap(arr,left,right);
                 left++;
                 right--;
             }
             if (arr[left]%2==0){
                 left++;
             }
             if (arr[right]%2==1){
                 right--;
             }

         }
     }  */

    // given an array 'a' sorted in non-decreasing order
    // return the array of the squares of each number sorted in non-decreasing order

    static int[] sortSquares(int arr[]){
        int left = 0 ; int right = arr.length-1;
        int ans[] = new int[arr.length];
        int k= 0;
        while (left<=right){
         if (Math.abs(arr[left])>Math.abs(arr[right])){
             ans[k++] = arr[left]*arr[left];
             left++;
         }else {
             ans[k++] = arr[right]*arr[right];
             right--;
         }
        }
        return ans;
    }




    static void printArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr [] = {-10,-5,-2,1,4,9};
      // sortZeroAndOne(arr);
     //  printArray(arr);
      //  evenodd(arr);
        int sortSquare[] = sortSquares(arr);

        printArray(sortSquare);
    }
}
