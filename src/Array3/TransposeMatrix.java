package Array3;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String[] args) {

        int a[][]={
                {1,2,3},
                {4,5,6}
        };
        System.out.println ("simple of matrix");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println ("Transpose of matrix");
        for(int i=0;i<a[0].length;i++){  //col = a[0].length
            for(int j=0;j<a.length;j++){//row
                System.out.print(a[j][i]+" ");
            }
            System.out.print("\n");
        }
    }
}
