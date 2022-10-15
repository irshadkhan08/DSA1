package Array3;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZero {
    public static void main(String[] args) {
        int a[] = {2, 3, 1, -4, 3, -2};//true
        //int a[] = {2, 3, 1, 4, 3, 2};//false
        int preSum = 0;
        int t = 0;
        boolean isTrue = false;
        Set<Integer> s=new HashSet<Integer> ();
        for (int i = 0; i < a.length - 1; i++) {
            preSum += a[i];

            if(s.contains(preSum)){
                isTrue = true;

            }
            s.add(preSum);
        }
        if(isTrue){

            System.out.println ("true");
        }else {
            System.out.println ("false");
        }
    }
}
