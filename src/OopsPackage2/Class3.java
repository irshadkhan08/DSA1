package OopsPackage2;

public class Class3 extends Class4 {
    public static void main(String[] args) {
      // Class2 obj2 = new Class2();
       //obj2.check ();

        // private package method or default method
        // default is package private
      // obj2.method2();

        Class4 obj = new Class4 ();
        obj.method4 ();
    }
}

class Class4{
    void method4(){
        System.out.println ("method4 of class4");
    }
}