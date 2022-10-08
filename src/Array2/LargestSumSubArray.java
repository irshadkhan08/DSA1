package Array2;

public class LargestSumSubArray {
    public static void main(String[] args) {
        int arr[]  = {-2,7,-6,4,1,-3,8};//11
    //   int arr[]  = {6,-7,4,-2,1,5,-4};//8
          int cur = 0;
          int MaxSum = -1;
          for(int i = 0; i<arr.length; i++){

                  cur+=arr[i];

               if(cur<0){
                  cur = 0;
              }
              else if( MaxSum <cur){
                   MaxSum  = cur;
              }
          }
        System.out.println (MaxSum);

        }

    }
