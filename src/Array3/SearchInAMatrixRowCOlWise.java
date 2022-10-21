package Array3;

public class SearchInAMatrixRowCOlWise {

    static boolean SearchMatrix(int a[][],int  key){
        int i = 0;
        int j = a.length-1;
        while(i<a.length && j>=0){
            if(a[i][j]==key){
                return true;
            }
            else if(key>a[i][j]){
                i++;
            }else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int a [][] = {
                {1,4,5,7},
                {2,5,6,9},
                {6,10,11,13},
                {8,12,15,18}
        };

        SearchMatrix(a,6);
        System.out.println (SearchMatrix (a,11));

    }
}
