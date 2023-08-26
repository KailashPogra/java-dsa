
class arrayExample{
    arrayExample(){
        // creating array
        int ages[] = new int[5];

        ages[0]=10;
        ages[1]=11;
        ages[2]=12;
        ages[3]=13;
        ages[4]=14;
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

    }
   static void twoD_array(){
    int[][] arr = {{0,1,2},{3,4,5},{5,6,7}};

      // System.out.println(arr[0][1]);

       // traversing on array

       for (int i=0 ;i<3 ; i++ ){
           for (int j = 0; j <3 ; j++) {
          //     System.out.println(arr[i][j]);
           }
       }

       // print all element by using for each but we can use it it onli in 1D array

      int oneD[] = {0,1,2,3,3,4,4,5,6};
    for (int x : oneD){
        System.out.println(x);
    }
    }
}
public class array {
    public static void main(String[] args) {

        arrayExample obj = new arrayExample();
        arrayExample.twoD_array();
    }
}
