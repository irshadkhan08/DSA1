package OOPS2;

public class LearnEncapsulation {
    public static void main(String[] args) {
        Secret obj = new Secret();
//        obj.data = 23;
//        System.out.println (obj.data);

        obj.setData (200);
        obj.setData (24);
        System.out.println (obj.getData ());
    }
}

class Secret{
   private int data;
    public void setData(int data){
        //this.data = data;
        if(data>100){
            this.data = data;
        }
        else{
            System.out.println ("you are not allowed :"+data);
        }
    }
    public int getData(){
        return data;
    }
}