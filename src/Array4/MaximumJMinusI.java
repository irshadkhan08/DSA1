package Array4;

public class MaximumJMinusI {
    public static void main(String[] args) {



        int a[] = {3,4,5,1,7,2,6,5,4,1};
//        int  l[] ={3,4,5,5,7,7,7,7,7,7};
//        int  r[] ={7,7,7,7,7,6,6,5,4,1};

        int i,j,max = -1;
         for(i = 0; i<a.length-1; i++){
             for(j = a.length-1; j>i; --j){
                 if(a[j]>a[i] && max<(j-i))
                     max = j-i;
             }
         }
        System.out.println (max+" ");
//        int ans = 0;
//        for(int i = 0; i<a.length; i++){
//            for(int j = i+1; j<a.length; j++){
//                if(a[j]>a[i]){
//                    ans = Math.max(ans,j-i);
//                }
//            }
//        }
//        System.out.println (ans+" ");






//        int a[] = {60,20,10,40};
//        int i = 0;
//        int j = a.length-1;
//        int ans = 0;
//
//        while(i<j){
//            if(a[j]>a[i]){
//                if(j-i>ans){
//                    ans = j-i;
//                    break;
//                }
//                i++;
//            }else{
//              j--;
//            }
//        }
//        System.out.println (ans+" ");

    }
}

