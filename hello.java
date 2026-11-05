interface A{
    public void show();
    public void confg();
}

class B implements A{
    public void show(){

        System.out.println("bokul");
    }
    public void confg(){
        System.out.println("polash");
    }
}

public class hello  {
    public static void main(String[] args) {
     B obj =new B();
     obj.show();
     obj.confg();

    }
}
