package OOPS1;

class Animal {
    int legs;
    String name = "Lion";

    void walk() {
        System.out.println (this.name + " is walking");
    }

    void walk(int steps) {
        System.out.println ("Animal walked " + steps + " steps");
    }

    Animal() {
        System.out.println ("calling the default constructor");
    }

    Animal(String name) {
        this ();
        System.out.println (this.name + " was passed while creating");
    }
}
public class MainClass {
    public static void main(String[] args) {

        Animal a1 = new Animal();
        Animal a2 = new Animal("cat");
        a1.name = "dog";
        a1.legs = 4;
        a1.walk();
        a1.walk(5);
    }
}
