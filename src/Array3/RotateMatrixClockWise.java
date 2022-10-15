package Array3;
import java.util.Set;

public class RotateMatrixClockWise {


    public static void main(String[] args) {
        int a[][] = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        System.out.println ("simple matrix");
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a.length; j++){
                System.out.print (a[i][j]+" ");
            }
            System.out.println ();
        }
        System.out.println ("rotate matrix");
        int sum[][] = new int[a.length-1][a.length-1];
        for(int i = 0; i<a.length; i++){
            for(int j = a.length-1; j>=0; j--){
                System.out.print(a[j][i]+" ");
            }
            System.out.print ("\n");
        }

    }
}
