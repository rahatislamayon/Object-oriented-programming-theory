package javaPractice.src;

class tready extends Thread{
    int st;
    int ed;
    int sum = 0;
    String name;
    tready(int st,int ed,String name){
        this.st=st;
        this.ed=ed;
        this.name=name;


    }
    @Override
    public void run() {
        for(int i=st;i<=ed;i++){
            sum+=i;
            }
            System.out.println( "Sum:"+sum+ " "+name);


    }
}

public class examthread {
    public static void main(String[] args) throws InterruptedException {
        tready t1 = new tready(1,5,"fast");
        tready t2 =new tready(6,10,"secend");
        t1.start();
        t2.start();
         t1.join();
         t2.join();

    }
}
