package RecursionAndBacktracking1;

public class TotalPath {
    public static int path(int n, int m){
       if(n==1)
           return n;
       if(m==1)
           return m;
        return path (n,m-1)+path (n-1,m);
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 4;
       // path(n,m);
        System.out.println ("Total path of matrix first index to last Index : "+path(n,m));

    }
}
