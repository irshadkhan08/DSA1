package OOPS2;

public class LearnInheritance {
    public static void main(String[] args) {

        Samsung s10 = new Samsung();
        s10.os = "Android";
        s10.playGames ();
//        Apple a1 = new Apple();
//        a1.playGames ();
//        a1.playGames (5);

        MobilePhone obj = new MobilePhone();
        obj.playGames ();
        obj.playGames (2);
    }
}
class Samsung extends MobilePhone{
    void playGames(){
        System.out.println ("samsung playing game");
    }
}
class Apple extends MobilePhone{

}
class MobilePhone{
    String os;
    int price;
    int dimen;

    void playGames(){
        System.out.println ("Mobile phone playing game");
    }
    void playGames(int x){
        for(int i = 0; i<x; i++){
            System.out.println ("Playing games "+i);
        }
    }
}