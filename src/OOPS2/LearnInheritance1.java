package OOPS2;

public class LearnInheritance1 {
    public static void main(String[] args) {
        Dog d = new Dog ();
        d.name = "Tommy";
        d.eat ();
        d.display ();
    }
}
class Animal {
    String name;
    public void eat(){
        System.out.println ("I can eat");
    }
}
class Dog extends Animal{
    public void display(){
        System.out.println ("My name is "+name);
    }
}