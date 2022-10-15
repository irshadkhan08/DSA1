package Array2;

public class MostWaterContainer {
    public static void main(String[] args) {
   //  int a[] = {1,8,6,2,5,4,8,3,7};
        int a[] = {1,4,6,2,4};
        int l = 0;
        int r = a.length-1;
        int area = 0;
        int maxArea = Integer.MIN_VALUE;

        while(l<r){
            int d = r-l;
        if(a[l]<a[r]){
            area = d*a[l];
            l++;
//            if(maxArea<area){
//                maxArea = area;
//            }
        }
        else{
            area = d*a[r];
            r--;
//            if(maxArea<area){
//                maxArea = area;
//            }
        }
        if(maxArea<area){
            maxArea = area;
        }
    }  System.out.println ("Maximum Area :"+maxArea);
    }
}
