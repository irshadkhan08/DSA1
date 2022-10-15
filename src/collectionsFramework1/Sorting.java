package collectionsFramework1;


//import java.util.ArrayList;
//import java.util.List;
import java.util.*;

public class Sorting {

    static class Student implements Comparable<Student>{
        int rollNo;
        String name;
        Student(int rollNo,String name){
            this.rollNo = rollNo;
            this.name = name;
        }
//
        public String toString(){
            return "Student [rollNo = "+rollNo+" , name = "+name+" ]";
        }
//        @Override
        public int compareTo(Student o) {
            if(this.rollNo>o.rollNo) return 1;
            if(this.rollNo<o.rollNo) return -1;
            return 0;
          //  return this.rollNo-o.rollNo;
        }
    }
//
    static class StudentNameComparator implements Comparator<Student>{
        public int compare(Student s1, Student s2){
            return s1.name.compareTo (s2.name);
        }
    }
    public static void main(String[] args) {

//
        Student s1 = new Student (1,"irshad");
        Student s2 = new Student(2,"sakir");
        Student s3 = new Student(3,"Anil");
        List<Student>list = new ArrayList<>();
        list.add(s2);
        list.add(s3);
        list.add(s1);
        System.out.println (list);
//        //Collections.sort(list,new StudentNameComparator ());
//
       Collections.sort(list);
        System.out.println (list);


                int a[][] = {
                {1,2,23},
                {3,5,12},
                {1,7,1}
        };
        Arrays.sort (a, new Comparator<int[]> () {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int x[] :a){
            for(int e:x){
                System.out.print (e+" ");
            }
            System.out.println ();
        }


//        int a[][] = {
//                {1,2},
//                {3,5},
//                {1,7}
//        };
//
//        List<List<Integer>>list = new ArrayList<List<Integer>>();
//        for(int i = 0; i<a.length; i++){
//            List<Integer>l = new ArrayList<> ();
//            list.add(l);
//        }
//
//        list.get(0).add(1);
//        list.get(0).add(2);
//
//        list.get(1).add(3);
//        list.get(1).add(5);
//
//        list.get(2).add(1);
//        list.get(2).add(7);
//        System.out.println (list);
    }
}
