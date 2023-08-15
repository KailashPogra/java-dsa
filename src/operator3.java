//Q4 - Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
//   i) both the conditions 'a < 50' and 'a < b' are true.
//  ii) at least one of the conditions 'a < 50' or 'a < b' is true.
public class operator3 {
 public static void main(String[] args){
   
   int a = 55;
   int b = 70;


   // in the && operator if any operand is false then it returns false it doesn't matter how many
     //operand you compare
    System.out.println( a<55&&a<b&&b>70) ;
// in OR || operator if any operator is true then it returns true it doesn't matter how many
//operand you compare
    System.out.println( a<50||a<b||b>70) ;

   
}
}
