package Basic1;

public class Conditionals {
    public static void main(String[] args) {


       // System.out.println ("Voting stared");

        int age = 45;
//        if(age>=18){
//            System.out.println ("you can vote");
//        }
//        else{
//            System.out.println ("ride ferris wheel");
//        }
//        System.out.println ("voting ended");

        int marks = 98;
        if(marks>90){
            System.out.println ("A+");
        }
        else if(marks>80){
            System.out.println ("A");
        }
        else if(marks>70){
            System.out.println ("B+");
        }
        else if(marks>60){
            System.out.println ("B");
        }
        else{
            System.out.println ("C");
        }



        int a = 34;
        int b = 56;
        int c = 12;

        if(a>b){
            if(a>c){
                System.out.println ("a");
            }
            else{
                System.out.println ("c");
            }
        }
        else{
           if(b>c){
               System.out.println ("b");
           }
           else{
               System.out.println ("c");
           }
        }


        String name = "Friday";

        switch(name){
            case "Monday":
                System.out.println ("Today is Monday");
                break;
            case "Tuesday":
                System.out.println ("Today is Tuesday ");
                break;
            case "Wednesday":
                System.out.println ("Today is Wednesday");
                break;
            case "Thursday":
                System.out.println ("Today is Thursday");
                break;
            case "Friday" :
                System.out.println ("Today is Friday");
                break;
            default:
                System.out.println ("Invalid");
        }

    }
}
