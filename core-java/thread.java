import java.lang.*;
class Thread1 implements Runnable {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread1 is running");
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class Thread2 extends Thread {
  public void run() {
    for (int i = 0; i < 10; i++) {
      System.out.println("Thread2 is running");
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class thread {
  public static void main(String[] args) {
    Thread1 myThread = new Thread1();
    Thread2 myThread2 = new Thread2();

    Thread thread = new Thread(myThread);

    thread.start();
    myThread2.start();

    System.out.println(thread.getName());
  }
}