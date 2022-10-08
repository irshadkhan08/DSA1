package Basic1;
import java.io.*;

public class HelloWorld {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");

        float age = (float)23.5;
        age = 35.2f;
        float rating = (float)3.34525;
        double marks = 2344.34;
        boolean isPassed = false;
        var grade = 'A';
        int grade1 = 'B';
        int x = 34;
        double y = x;
        double a = 2324.452;
        int b = (int)a;


        System.out.println ("age :"+age);
        System.out.println ("rating :"+rating);
        System.out.println ("marks :"+marks);
        System.out.println ("isPassed :"+isPassed);
        System.out.println ("grade :"+grade);
        System.out.println (a+b);
        System.out.println ("a :"+a +"\nb: "+b);

    }
}
