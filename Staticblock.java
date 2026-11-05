public class Staticblock {
    Staticblock(){
        System.out.println("constructor");
    }
    {
        System.out.println("block");
    }
    static{
        System.out.println("static block2");
    }
    static{
        System.out.println("static block");
    }
    public static void main(String[] args) {
        System.out.println("main");
        Staticblock obj=new Staticblock();
        Staticblock obj1=new Staticblock();
    }
}
