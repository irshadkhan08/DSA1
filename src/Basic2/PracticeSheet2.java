package Basic2;

public class PracticeSheet2 {
//    public static int fib(int num){
//        if(num ==0 || num==1){
//            return num;
//        }
//        else{
//            return(fib(num-1)+fib(num-2));
//        }
//    }

    public static void fib(int num) {

        int a = 0;
        int b = 1;
        int c = 0;
        System.out.println (a+b+" ");
        int i = 1;
        while(i<num){
            c = a+b;
            a = b;
            b = c;
            i++;
            System.out.println (c+" ");
        }
    }

    public static void fact(int num){
        int f = 1;
        int i = 1;
        while(i<=num){
            f*=i;
            i++;
        }
        System.out.println ("The factorial of "+num+" is : "+f);
    }
    public static void main(String[] args) {

        //problem1
//        int numbers[] = {2,3,4,6,1};
//        int avg = 0;
//        int sum = 0;
//        System.out.println ("The given array is below");
//        for(int i = 0; i<numbers.length; i++){
//            System.out.println (+numbers[i]+" ");
//            sum+= numbers[i];
//        }
//        avg = sum/numbers.length;
//        System.out.println ("\nThe average value of given array "+avg+"\n");
//        for(int i = 0; i<numbers.length; i++){
//           if(numbers[i]>avg){
//               System.out.println (numbers[i]);
//           }
//        }


        //program2
//        int n = 8;
//        System.out.println ("Multiplication Table of "+n);
//        for(int i = 1;i<=10; i++){
//            System.out.println (n+"X"+i+" = "+(n*i));
//        }

        //program3
//        int a[] = {3,5,8,4,2};
//        int sum = 0;
//        for(int i = 0; i<a.length; i++){
//            sum = sum+a[i];
//        }
//        System.out.println ("Sum value of array:"+sum);

        //program4
        // write a java program find maximum and minimum value of an array

//        int arr[] = {4,3,-2,45,34,1,8};
//        int max = arr[0];
//        int min = arr[0];
//
//        for(int i = 0; i<arr.length; i++){
//           if(arr[i]>max) {
//               max = arr[i];
//           }
//           if(min>arr[i]){
//               min = arr[i];
//           }
//        }
//        System.out.println ("Maximum value of array :"+max);
//        System.out.println ("Minimum value of array :"+min);

        // ques6 write a java method to find the smallest number among three numbers
//        int a = 3, b = -3, c = 8;
//        if(b>a){
//            if(c>a){
//                System.out.println (a);
//            }
//        }
//        else{
//            if(b>c){
//                System.out.println (c);
//            }
//            else{
//                System.out.println (b);
//            }
//        }

        //problem7 write a method to print Fibonacci value of any number entered through the keyboard.

//        int num = 10;
//        int ans = fib(num);
//        System.out.println ("Fibonacci number= "+ans);

//        int num = 10;
//        fib(num);
//
//        int a[] = {1,2,3,5};
//        int l = 0;
//        int r = a.length-1;
//        int i = 0;
//        while(l<r){
//        while(l<r){
//            int temp;
//            temp = a[r-l];
//            a[r-l] = a[l];
//            a[l] = temp;
//            temp = a[i];
//            a[i] = a[r-i];
//            a[r-1] =  temp;
//for(int j = l; j<r; j++){
//          int  temp = a[r];
//            a[l] = a[r];
//            a[r] = temp;
//
//            System.out.println (a[l+1]+" ");
//            l++;
//            r--;
//        }


        //problem8
        //write a java to find the factorial value of any number through the keyboard.
//        int num1 = 5;
//        fact(num1);

        int a[][] = {
                {1,1,1,0,0,0},
                {0,1,0,0,0,0},
                {1,1,1,0,0,0},
                {0,0,2,4,4,0},
                {0,0,0,2,0,0},
                {0,0,1,2,4,0},
        };
        int sum = 0;
//        for(int i = 3;i<=a.length; i++)
//        {
//            for(int j = 2; j<=a[i].length; j++){
//               sum = sum+ a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+2]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
//            }
//        }
        for(int i = 0; i<a.length;i++ ){
            for(int j= 0; j<a.length; j++){
                sum = sum+a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+2]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];
            }
        }
        System.out.println (sum+" ");



    }
}
