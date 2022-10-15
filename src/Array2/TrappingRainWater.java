package Array2;

public class TrappingRainWater {
    public static void main(String[] args) {

        // int a[] = {1,0,2,1,0,1,3,2,1,2,1};
//        int l[] = new int[a.length];
//        int r[] = new int[a.length];
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MIN_VALUE;
//        int temp = 0,t=r.length-1;

//        for(int i  = 0; i<a.length;  i++){
//            if(max<a[i]){
//                max = a[i];
//            }
//            l[temp++] = max;
//            System.out.print(l[i]+" ");
//        }
//        System.out.println ("\n-------------------------");
//        for(int j = a.length-1 ; j>=0; j--){
//            if(min<a[j]){
//               min = a[j];
//            }
//            r[t--] = min;
//            System.out.print(r[j]+" ");
//        }

        int a[] = {1,0,2,1,0,1,3,2,1,2,1};
        int lmx = 0,rmx = 0;
        int l = 0;
        int r = 0;
        int i = 0;
        int j = a.length-1;
        while(i<=j){
            if(a[i]<=a[j])
            {
                if(a[i]> lmx){
                 lmx = a[i];
                }else
                    r = r+lmx-a[i];
                i++;
            }
            else{
               if(a[j]>rmx){
                   rmx = a[j];
               }else
                r = r+rmx-a[j];
               j--;
            }
        }
        System.out.println (r);


//        int min  =0;
////        int a[] = {1,0,2,1,0,1,3,2,1,2,1};
////        int l[] = {1,1,2,2,2,2,3,3,3,3,3};
////        int r[] = {3,3,3,3,3,3,3,2,2,2,1};
//
//        int a[] = {4,2,0,3,2,5};
//        int l[] = {4,4,4,4,4,5};
//        int r[] = {5,5,5,5,5,5};
//       int ans = 0;
//        for(int i = 0; i<a.length-1; i++){
//          ans = ans+ Math.min(l[i],r[i])-a[i];
//        }
//        System.out.println (ans);
        }
    }

