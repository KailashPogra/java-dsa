public class arrayClone {
    static void printArray(int []array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("original value");
        printArray(arr);
        System.out.println("right way of cloning an array");
        // .clone is used to allocate new memory for copied array
        int array[] = arr.clone();
        array[0]= 10;
        printArray(array);
    }
}
