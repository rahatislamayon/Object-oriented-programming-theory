package javaPractice.src;


 class G extends Thread {

   public void run(){
        for(int i=1;i<=10;i++) {
            System.out.println(i);

    }
}}

public class thrd {
    public static void main(String[] args) throws Exception{
        G a1 = new G();
        G a2 = new G();
        G a3 = new G();
        a1.start();
        a2.start();
        a3.start();
        a1.join();
    }
}