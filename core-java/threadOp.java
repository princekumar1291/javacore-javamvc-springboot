public class threadOp {
  public static void main(String[] args) {
    Thread thread = Thread.currentThread();
    System.out.println("Thread Name: " + thread.getName());
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    thread.setName("Main Thread");
    System.out.println("Thread Name: " + thread.getName());

    System.out.println("Thread ID: " + thread.getId());

    Thread userTh = new UserThread();
    userTh.start();

  }
}


class UserThread extends Thread {
  public void run() {
    System.out.println("User Defined Thread is running");
  }
}