package OOPS2;

public class MainClass {
    public static void main(String[] args) {
       Alien obj = new Alien();
       obj.legs = 5;
      // obj.speak();
        Alien.speak ();

       Alien.isMemberOfEarth = true;
//       add(3,5);
        System.out.println (add(3,5));
       //Alien.speak(); --> only allowed static method
    }
    static int add(int a, int b){
        return a+b;
    }
}

class Alien{
  static boolean isIsMemberOfEarth = false;
    int legs;
    static boolean isMemberOfEarth = false;

     static void speak(){
        System.out.println ("alien speaks");
        sayHello ();
    }
    static void sayHello(){
        System.out.println ("alien says hello");
    }
}