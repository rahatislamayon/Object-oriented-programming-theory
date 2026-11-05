public class Objectvariable {
    int a = 1;
    static int b = 2;

    public static void main(String[] args) {
        Objectvariable obj1 = new Objectvariable();
        Objectvariable obj2 = new Objectvariable();

        System.out.println("a=" + obj1.a);
        System.out.println(obj1.b);
        obj1.a = 100;
        obj1.b = 200;
        System.out.println(obj1.a);
        System.out.println(obj1.b);

        System.out.println(obj2.a);
        System.out.println(obj2.b);
    }

}