package javaPractice.src;

 class thrdy extends Thread {
     String name;
     thrdy(String name){
         this.name=name;
     }


 }

 class One extends thrdy {
     One(String name){
         super(name);
     }
     @Override
     public void run(){
         for(int i=0;i<=10;i++){
             System.out.println(name+" "+i);
         }
     }
 }

 class Two extends One {
     int s;
     int e;
     int sum=0;
     Two(String name,int s,int e){
         super(name);
         this.s=s;
         this.e=e;

     }
     @Override
     public void run(){
         for(int i=s;i<=e;i++){
             sum=sum+i;
         }
         System.out.println(name+" "+sum);
     }

 }

 public  class thrd2{
     public static void main(String[] args) throws Exception{

     Two s1 = new Two("fast" ,1, 5);
         Two s2 = new Two("secend",6, 10);
         s1.start();
         s2.start();

         s1.join();
         s2.join();

         int a = s1.sum + s2.sum;
         System.out.println(a);

         System.out.println(s1.sum);
         System.out.println(s2.sum);
     }
 }



