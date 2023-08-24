// write a java program to add two number using method
class algebra{
    public int sum(int a , int b){
        return a+b;
    }
}
public class methods {
    public static void main(String[] args) {
        algebra sum1 = new algebra();
       int ans = sum1.sum(4,5);

        System.out.println(ans);
    }
}
