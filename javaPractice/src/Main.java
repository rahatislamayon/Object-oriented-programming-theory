package javaPractice.src;

//package javaPractice;
interface FastMovablr{
    public void move();
}

interface SlowMovablr{
    void move();
}


abstract class Character{
    String name;
    Character(String name){
        this.name=name;
    }
    abstract void move();
}

class player extends Character
        implements FastMovablr{

    player(String name){
        super(name);
    }
    @Override
    public void move() {
        System.out.println(name + "is moving fast");
    }

}

public class Main{
    public static void main(String[] args) {
        player p1 = new player("bokul") ;

        Character p2 = new player("polash") ;

        FastMovablr p3= new player("kolomoni") ;

        p1.move();
        p2.move();
        p3.move();
    }
}
