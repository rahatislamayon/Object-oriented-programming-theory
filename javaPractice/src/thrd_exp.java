package javaPractice.src;

 class th extends Thread{
   int s, e;
   double sum = 0;
   static int n;
   th(int s){
     this.s = s;
   }
   public void run(){
     for(int i = s; i <= n; i = i + 2){
       sum = sum + i / Math.pow(n, i - 1);
     }
   }
 }


public class thrd_exp {
     public static void main(String[] args) throws Exception{
         th a1=new th(1);
         th a2=new th(2);
         a1.start();
         a2.start();
         a1.join();
         a2.join();
     }
}
