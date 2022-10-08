package OopsPackage1;

import OopsPackage2.Class2;

public class Class1 extends Class2{
    public static void main(String[] args) {
        //Class2 obj = new Class2();

        //public class accessible other package
        /// obj.method2();
       // obj.method1();


       // obj.check();
        //obj.method2(); --> not accessible default method2()

        Class1 obj = new Class1();
        obj.method2();

        //obj.method2();
    }
     public void method1(){
        System.out.println ("i'm method1 of class1");
    }
}
