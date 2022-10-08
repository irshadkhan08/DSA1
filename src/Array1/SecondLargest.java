package Array1;

public class SecondLargest {
    public static void main(String[] args) {
//        int a[] = {4,2,3,4,0};
//        int f = a[0];
//        int s = a[0];
//        for(int i = 0; i<a.length; i++){
//            if(a[i]>f){
//                f=a[i];
//                break;
//            }
//        }
//        for(int j = 0; j<a.length; j++) {
//            if (f < s) {
//              //  s = a[j];
//                break;
//               // System.out.println (s);
//            }
//        }
//        System.out.println (s);


//        int a[] = {4,3,5,6};
//        int f = a[0];
//        int s = a[0];
//        for(int i =0; i<a.length; i++){
//            for(int j = i+1; j<a.length; j++){
//                if(a[i]>a[i+1])
//                {
//                    int temp;
//                    temp = a[i];
//                    a[i] = a[i+1];
//                    a[i+1] = temp;
//                }
//
//            }
//            System.out.println (a[i]);
//        }

        int a[] = {1, 2, 4, 88, 91, 71,};
        int l = 0;
        int sl = -1;
        for (int i = 0; i < a.length; i++) {
           if(a[i]>l){
               sl = l;
               l = a[i];
           }
           else if(a[i]<l){

               if(sl<a[i]){
                   sl = a[i];
               }

           }

        }
        System.out.println ("second largest element is :"+sl);
  // time complexity in these code = theta(n)
    }
}


