package RecursionAndBacktrackingDoubt2;

public class MajorityElement {
    public static void main(String[] args) {

//        int a[] = {2,3,2,2,2,3,3};
        int a[] = {2,3,3};
        int count = 0;
        int cur = -1;
        for(int i = 0; i<a.length; i++){
          if(count==0){
              cur = a[i];
              count = 1;
          }
          else{
              if(cur==a[i]){
                  count++;
                  System.out.println (cur+" ");
              }else{
                  cur = a[i];
                  count--;
              }
          }
        }
        int finalCount = 0;
        for(int e : a){
            if(e==cur){
                finalCount++;
            }
        }
        if(finalCount>a.length/2){
            System.out.println (finalCount+" ");
        }
        else{
            System.out.println ("false");
        }
    }
}
