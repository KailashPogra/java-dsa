public class arrayRefrance {
    static  void pritArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        System.out.println("original array ");
        pritArray(array);
        System.out.println("modified array");
        int []array_2 = array;
        array_2[0]=2;
        array_2[1]=5;
        pritArray(array_2);
        System.out.println("printing again original array");
        // value of array is equal to array_2 because in array copying new memory is not allocate
        // changes is happen on same memory address
        pritArray(array);
    }
}
