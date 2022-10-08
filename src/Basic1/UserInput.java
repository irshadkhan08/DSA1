package Basic1;
import java.io.*;

public class UserInput {
    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        System.out.println ("Please Enter your name");
//     //   sc.nextLine();
//        String name = sc.nextLine();
//        System.out.println ("Your name is "+name);
//        System.out.println ("Please Enter your age");
//        int age = sc.nextInt();
//        System.out.println ("Your age is "+age);


       // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ir);
        System.out.println ("Please Enter your age");
        int age = Integer.parseInt(br.readLine());
        System.out.println ("age = "+age);
        System.out.println ("Please Enter your name");
        String name = br.readLine();
        System.out.println ("My age is name ="+name);
    }
}
