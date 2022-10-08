package Array1;

public class DeleteElement {
    public static int delete(int arr[],int k){

       int i = 0;
       int n = arr.length;
        for(; i<n; i++){
            if(k==arr[i]) {
                break;
            }
        }
            for (int j = i; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
        return arr[i];
    }
    public static void main(String[] args) {
        int a[] = {2,1,4,6,5};
        int key = 6;
        delete(a,key);
        for(int e:a){
            System.out.print(e+" ");
        }
    }
}
