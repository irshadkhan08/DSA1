package Basic2;

public class Loops {
    public static void main(String[] args) {

        // for loop
//        for(int i = 10; i<= 20; i++) {
//            System.out.println ("Irshad"+i);
//        }

//        int n = 5;
//        for(int i = 0; i<n; i++){
//            System.out.print ("* ");
//        }
        // System.out.println ();

        //infinite loop
//        int index = 1;
//        while(index<=5){
//            System.out.println("Irshad");
//            index+=2;
//        }

//        int i = 1;
//        do{
//            System.out.println ("Hello");
//            i++;
//        }while(false);


        int arr[] = {0,1,0,1,0,1,0,1,0};


        int l = 0;
        int r = arr.length;
        while(l<r){
            while(arr[l]==0){
                l++;
            }
            while(arr[r]==1){
                r--;
            }
           arr[l]=0;
            arr[r]=1;
            l++;
            r--;
        }
       for(int i = 0; i<arr.length-1; i++){
           System.out.println (arr[i]+" ");
       }
//        int s = arr[0];
//        int l = arr.length - 1;

//        for (int i=0;i<=l;i++){
//            int temp;
//            if(s>l){
//                temp=arr[l];
//                arr[l]=arr[s];
//                arr[s]=temp;
//                l--;
//            }else if(s<l){
//                s++;
//            }else if(s==l){
//                s++;
//            }
//            System.out.println (arr[s]);
//        }


    }
}