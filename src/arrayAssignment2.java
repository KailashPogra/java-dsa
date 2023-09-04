public class arrayAssignment2 {
    public static void main(String[] args) {
        /*- Given an unsorted array arr[] of size N having both negative and positive integers, place
        //all negative elements at the end of array without changing the order of positive elements
        //and negative elements
        int arr[]= {1,5,-10,3,5,-3,-4,-6};
        int ans[] = new int[arr.length];
        int idx= 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
              ans[idx] = arr[i];
              idx++;
         }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                ans[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(ans[i]);
        }*/

        /*Given two arrays a[] and b[] of size n and m respectively where m >= n. The task is to find
        //union between these two arrays and print the number of elements of the union set.
        //Union of the two arrays can be defined as the set containing distinct elements from both
        //the arrays. If there are repetitions, then only one occurrence of element should be printed
        //in the union.
        int a [] ={1,2,3,5,6};
        int b [] ={2,1,4,6,8,3};
        int idx = 0;
        int ans[] = new int[idx];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                if(a[i]==b[j]){
                    idx++;
                    a[i]=ans[idx];

                }
            }
        }
        for (int i = 0; i < ans.length ; i++) {
            System.out.println(ans[i]);
        } */

        /*- Given an array arr[] and an integer K where K is smaller than size of array, the task is to
        //find the Kth smallest element in the given array. It is given that all array elements are
        //distinct.
   int arr[] = {5,6,7,8,9};
   int k = 3;
        for (int i = 0; i < arr.length ; i++) {
            if (k< arr.length && k<arr[i]){
                System.out.println(arr[i]);
                break;
            }
        } */

        //- Given an unsorted array A of size N that contains only non-negative integers, find a
        //continuous sub-array which adds to a given number S.
        //In case of multiple subarrays, return the subarray which comes first on moving from left
        //to right.
        //You need to print the start and end index of answer subarray.
     }

  }