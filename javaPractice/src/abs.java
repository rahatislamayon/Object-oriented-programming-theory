package javaPractice.src;


interface I1{
    int x = 10;
    public int add();
}
interface I2{
    int y = 12;
    public int minus();
}
abstract class A implements I1, I2{
    int z = 7;
    public abstract int calculate();
    public void show(){
        int val = A.x + A.y + z;
       // System.out.println(val);
    }
}
class B extends A{
    int a, b;
    B(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int add(){
        return this.a + this.b;
    }
    public int minus(){
        return this.a - this.b;
    }
    public int calculate(){
        return this.add() * this.minus();
    }
    public void show(){
        super.show();
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class abs {
    public static void main(String[] args) {
        B b = new B(4, 2);
        System.out.println(b.calculate());
        b.show();

    }
}