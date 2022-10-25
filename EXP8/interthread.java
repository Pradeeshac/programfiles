
package lab;

public class interthread
{
 
    public static void main(String[] args) {
              Chat m = new Chat();
              new Thread1(m);
              new Thread2(m);
   }
}
   class Chat {
   boolean flag = false;

   public synchronized void Question(String msg) {
      if (flag) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }
      System.out.println(msg);
      flag = true;
      notify();
   }

   public synchronized void Answer(String msg) {
      if (!flag) {
         try {
            wait();
         } catch (InterruptedException e) {
            e.printStackTrace();
         }
      }

      System.out.println(msg);
      flag = false;
      notify();
   }
}

class Thread1 implements Runnable {
   Chat m;
   String[] s1 = { "java", "oops laboratory", "object oriented programming" };

   public Thread1(Chat m1) {
      this.m = m1;
      new Thread(this, "Question").start();
   }

   public void run() {
      for (int i = 0; i < s1.length; i++) {
         m.Question(s1[i]);
      }
   }
}

class Thread2 implements Runnable {
   Chat m;
   String[] s2 = { "java", "oops laboratory", "object oriented programming" };

   public Thread2(Chat m2) {
      this.m = m2;
      new Thread(this, "Answer").start();
   }

   public void run() {
      for (int i = 0; i < s2.length; i++) {
         m.Answer(s2[i]);
      }
   }
}

