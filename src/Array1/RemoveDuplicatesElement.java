package Array1;

public class RemoveDuplicatesElement {
    public static void main(String[] args) {
        int a[] = {1,1,2,2,2,2,2,2,4,4,4,4,5};
        int j = 0,i=0;
        for(; i<a.length; i++){
            if(a[i]!=a[j]) {
                a[j + 1] = a[i];
                j++;
            }
       }
        for(int e:a){
            System.out.print(e+" ");
        }

    }
}
