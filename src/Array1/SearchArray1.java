package Array1;

public class SearchArray1 {
    public static void main(String[] args) {
        int key = 61;
        int arr[] = {1,4,2,4,6};
        int res = -1;
        for(int i = 0; i<arr.length; i++){
            if(key==arr[i]){
                res= i;
                break;
                //System.out.println ("found array = "+arr[i]);
            }
//            else{
//                System.out.println ("Not found:");
//            }
        }
        if(res==-1){
            System.out.println ("Not found ");
        }
        else {
            System.out.println ("Found " + res);
        }
    }
}
