package lab;

public class test_thread_many {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);
        for(int i=1;i<=n+1;i++)
        {
        Thread1 th=new Thread1();
        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }
        th.start();
        }
    }
}
class Thread1 extends Thread
{
        public void run()
    {
        if((Thread.currentThread().getName()).equals("Thread-0"))
        {
            System.out.println("------THREADS--------");
        }
        else
            System.out.println("Hello,I am #"+Thread.currentThread().getName());
    }
}