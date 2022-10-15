package Basic1;
import java.util.Scanner;

public class PracticeSheet1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //problem1
//        int n1 = sc.nextInt();
//        int n2 = sc.nextInt();
//        System.out.println (n1*n2);

        //problem2
//        float r = sc.nextInt();
//        float pi = 3.14f;
//        System.out.println ("The area of circle = "+(pi*r*r));
//        System.out.println ("The perimeter of circle = "+(2*pi*r));

        //problem3
        //inch convert_to_meter
        // 1m  = 39.37inches or 1 inches = 0.0254meters
//        System.out.println ("Enter The value of meter :");
//        int meter = sc.nextInt();
//        double ans = meter*39.37f;
//        System.out.println ("meter convert to inch = "+ans+" inch");
//        System.out.println ("Enter the value of inch:");
//        int inch = sc.nextInt();
//        double  ans1 = inch*0.0254f;
//        System.out.println ("inches convert to meter = "+ans1+" meters");

        //problem4
//        int a = 3;
//        int b = 20;
//        int c = 19;
//        // syntax a>b?a:b
//        //int ans = (a>b&&a>c)?a:(b>c)?b:c;
//        int ans = (a>b)?(a>c?a:c):(b>c?b:c);
//        System.out.println ("greatest value among three :"+ans);

       // problem5

//        int year = 2019;
//        if((year%400==0)||(year%4==0&&year%100 !=0)){
//            System.out.println (year+" Leap year");
//        }
//        else{
//            System.out.println ("This is not leap year");
//        }

//        int year = 2000;
//        boolean isLeaf = false;
//        if(year%4!=0){
//            isLeaf = false;
//        }
//        else if(year%400==0){
//            isLeaf = true;
//        }
//        else if(year%100==0){
//            isLeaf = false;
//        }
//        else{
//            isLeaf = true;
//        }
//        if(isLeaf){
//            System.out.println (year+" is leap year");
//        }
//        else{
//            System.out.println (year+" is not leap year");
//        }

        int year = 1200;

//        if(year%400==0) {
//            if (year % 100 == 0) {
//                if (year % 4 == 0) {
//                    System.out.println (year + " is Leap year");
//                } else {
//                    System.out.println (year + " is not Leap year");
//                }
//            } else {
//                System.out.println ("Leap year is " + year);
//            }
//        }
//        else{
//            System.out.println (year+ "is not leap year");
//        }


       // problem6

        int num1 = 10,num2 = 5, temp;
//        System.out.println ("Before swapping ");
//        System.out.println ("num1 = "+num1+"\n num2 = "+num2);
//        temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println ("After swapping");
//        System.out.println ("num1 = "+num1+"\n num2 = "+num2);

        //without third variable
//        num1 = num1*num2;
//        num2 = num1/num2;
//        num1 = num1/num2;

//        num1 = num1+num2;
//        num2 = num1-num2;
//        num1= num1-num2;
//        System.out.println ("Without using third variable swapping");
//        System.out.println ("num1 = "+num1);
//        System.out.println ("num2 = "+num2);

        String grade = sc.next();
        grade = grade.toUpperCase();

        switch(grade){
            case "Assss.java" :
                System.out.println ("congratulations!! your marks is 75-100");
                break;
            case "B":
                System.out.println ("Good your marks is 60-75");
                break;
            case "C":
                System.out.println ("average your marks is 50-60");
                break;
            case "D":
                System.out.println ("pass your marks is 33-50");
                break;
            case "e":
                System.out.println ("You are fail");
                break;
            default :
                System.out.println ("!Error");
                System.out.println ("The grade is invalid");
        }
    }
}
