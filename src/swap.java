// swap two number using third variable and without third variable
public class swap {
    public static void main(String[] args) {
        // using third variable
//        int x= 10;
//        int y=15;
//        int z = x;
//        x=y;
//        y=z;
//        System.out.println(x);
//        System.out.println(y);
        //without third var
        int A = 10;
        int B = 15;
        A = A+B;
        B= A-B;
        A=A-B;
        System.out.println(A);
        System.out.println(B);

    }
}
