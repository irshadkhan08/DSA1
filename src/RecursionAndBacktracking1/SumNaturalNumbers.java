package RecursionAndBacktracking1;

public class SumNaturalNumbers {
    public static int sum(int n){
        if(n==0)
            return 0;
        if(n==1)
            return n;
        return n+sum (n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println (sum(n));
    }
}
