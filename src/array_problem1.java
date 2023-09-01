public class array_problem1 {
    //find the last occurrence of an element x in given array.
    public static void main(String[] args) {

        int array[]= {1,2,3,3,4,5,5,6,5,6,5,6};
        int x = 5;
        int lastindex = -1;
        for (int i = 0; i < array.length ; i++) {
            if (array[i]==x){
              lastindex=i;
            }
        }
        System.out.println(lastindex);
    }
}
