package collectionsFramework;

import java.util.*;  // all collection framework provide in java.util.*;
public class LearnArrayList {
    public static void main(String[] args) {



//        String [] studentName = new String[30];
//        studentName[0] = "Irshad";
//        studentName[29] = "monika";
//        //new student
//        studentName[30] = "neha";

//        ArrayList<String>studentsName = new ArrayList<> ();
//
////        size = n
////                n +n/2+1;
//        studentsName.add("Neha");

//       List<Integer>list = new ArrayList();
//       list.add(1);
//       list.add(2);
//       list.add(3);
//        System.out.println (list); //[1, 2, 3]
//        list.add(4);
//        System.out.println (list);//[1, 2, 3, 4]
//        list.add(1,13);
//        System.out.println (list);//[1, 13, 2, 3, 4]
//
//        List<Integer>newList = new ArrayList<> ();
//        newList.add(100);
//        newList.add(102);
//        list.addAll (newList);
//        System.out.println (list);//[1, 13, 2, 3, 4, 100, 102]
//
//        System.out.println (list.get(1));//13

        List<Integer>list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
//        System.out.println (list); //[10, 20, 30, 40, 50]
//
//        list.remove (1 );
//        System.out.println (list);//[10, 30, 40, 50]
//
//        list.remove(Integer.valueOf(30));
//        System.out.println (list);//[10, 40, 50]
//
//        list.clear();
//        System.out.println (list);//[]

//        System.out.println (list);//[10, 20, 30, 40, 50]
//        list.set(2,390);
//        System.out.println (list);//[10, 20, 390, 40, 50]
       // time complex - > o(n)

        System.out.println (list.contains (50));//true


    }
}
