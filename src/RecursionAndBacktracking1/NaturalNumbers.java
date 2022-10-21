package RecursionAndBacktracking1;

public class NaturalNumbers {
    public static void numbers(int n){
        if(n==0)
            return ;
        System.out.println (n);// before recursive calling function 5,4,3,2,1 // stack ki value store
        numbers (n-1);
        System.out.println (n);// After recursive calling function 1,2,3,4,5 // stack empty
    }
    public static void main(String[] args) {
        int n = 5;
        numbers(n);
    }
}
