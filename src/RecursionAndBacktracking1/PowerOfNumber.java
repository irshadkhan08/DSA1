package RecursionAndBacktracking1;

public class PowerOfNumber{
    public static int power(int a, int p) {
//        if(p==0)
//            return 1;
       if(p==1) //base case
           return a;
       return a*(power(a,p-1));
    }
    public static void main(String[] args) {
            int a = 2,p = 5;
            System.out.println ("Power of Number : "+power(a,p));
    }
}
