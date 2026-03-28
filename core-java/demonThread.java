class DaemonWorker extends Thread {
  public void run() {
      System.out.println("Daemon thread is running");
  }
}

public class demonThread {
  public static void main(String[] args) {
      DaemonWorker dt = new DaemonWorker();
      dt.setDaemon(true);
      dt.start();
      System.out.println(dt.isDaemon());
      System.out.println("Main thread is running");
      System.out.println("Main thread is finished");
  }
}