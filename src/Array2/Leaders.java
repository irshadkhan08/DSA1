package Array2;

public class Leaders {
    public static void main(String[] args) {
       int a[] = {2,7,6,2,1,4,3};
       int temp[] = new int[4];
       int b = 0;
//       int j = 0;
        int min = Integer.MIN_VALUE;
        for(int i = a.length-1; i>0; --i) {
            if (min < a[i]) {
                min = a[i];
                System.out.print(a[i]+" ");
                temp[b++] = a[i];
            }
        }
            System.out.println ("\nReverse Elements... "+"");

            for(b =temp.length-1; b>=0; b--  ){
                System.out.print (temp[b]+" ");
            }



//        int cur = 0;
//        int a[] = {2,7,6,2,1,4,3};
//        loop1:
//        for(int i = 0; i<a.length; i++){
//            cur = a[i];
//            for(int j = i+1; j<a.length; j++){
//                if(cur>a[j]){
//                    continue loop1;
//                }
//                System.out.println (cur);
//            }
//
//        }
    }
}
