package Basic2;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int ageList[] = new int[5];
//        for(int i = 0; i<3; i++){
//            System.out.println ("Enter the age :"+"ageList["+i+"]");
//            ageList[i] = sc.nextInt();
//        }

//        for(int i = 0; i<ageList.length; i++){
//            System.out.println ("age of roll no "+(i+1)+ " is "+ageList[i]);
//        }
        //for each loop
//        for(int element:ageList){
//            System.out.println (element);
//        }
//

        int[][] arr = new int[3][3];
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                System.out.print ("a["+i+"]"+"["+j+"] = "+arr[i][j]+" ");
            }
            System.out.println ();
        }
    }
}
