package OOPS1;

class Person{
    String name = "sakir";
    int age = 28;
    static int count; // by default int value is 0
    public Person(){
        count++;
        System.out.println ("Person is being created "+count);
    }
    Person(String name, int age){
        this();
        System.out.println ("My name is "+this.name);
        System.out.println ("My age is "+this.age);
        walking(this);
    }
    void walking(Person obj){
        System.out.println (name +" is walking");
    }
}
public class MainClass1 {
    public static void main(String[] args) {
//       Person p = new Person ();//1
//        Person p1 = new Person ();//2
//        Person p2 = new Person();//3
//        System.out.println (Person.count);//3
//        Person p3 = new  Person("irshad",21);
//        System.out.println (p3.name+" "+p3.age);
//        System.out.println (Person.count);

        Person p3 = new Person();
        p3.name = "irshad";
        p3.age = 21;
        System.out.println (p3.age);
    }
}
