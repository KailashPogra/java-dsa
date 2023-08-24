
class operation{
    int a,b ;
    operation(int x , int y){
        System.out.println("constuctor called");
        a=x ;
      b=y ;
    }
    int sum(){
        return a+b;
    }
    int subs(){
        return a-b;
    }
    int mul(){
        return a*b;
    }
}
public class constructor {
    public static void main(String[] args) {
        operation obj = new operation(4, 5);
        System.out.println(obj.sum());
        System.out.println(obj.subs());
        System.out.println(obj.mul());
    }
}