package RecursionAndBacktracking3;

public class SumOfDigits {
    // use recursive method
    public static int sum(int n){
        int rem;
        if(n<=10)
            return n;
        rem = n%10;//5
        int ans = sum(n/10);
        return rem+ans;
    }
    public static void main(String[] args) {
        int n = 12345;

        System.out.println ("Sum of digits : "+sum(n));
//        int rem = 0;
//        int sum = 0;
//        while(n!=0){
//            rem = n%10;
//            sum = sum+rem;
//            n = n/10;
//        }
//        System.out.println (sum);
    }
}
