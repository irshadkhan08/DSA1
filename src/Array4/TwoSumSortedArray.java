package Array4;

public class TwoSumSortedArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 7, 8, 10, 12};
        int l = 0;
        int r = a.length - 1;
        int sum = 10;
        int curSum = 0;
        boolean isFalse = false;
        while (l < r) {
            curSum = a[l]+a[r];
            if(curSum>sum){
                curSum = sum;
                r--;
            }
            else if(curSum<sum){
                curSum = sum;
                l++;
            }else {
                isFalse = true;
                curSum = sum;
                break;
            }
        }
        System.out.println (curSum+" ");
        System.out.println (isFalse+" ");
    }
}
