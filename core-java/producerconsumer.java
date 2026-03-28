public class producerconsumer {
  public static void main(String[] args) {
    Company copm = new Company();
    Producer p = new Producer(copm);
    Consumer c = new Consumer(copm);
    p.start();
    c.start();
  }
}

class Company {
  int n;
  boolean f = false;
  synchronized public void produce_item(int n) {
    if (f) {
      try {
        wait();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    notify();
    f = true;
    this.n = n;
    System.out.println("Item produced: " + n);
  }
  synchronized public int consume_item() {
    if (!f) {
      try {
        wait();
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    notify();
    f = false;
    System.out.println("Item consumed: " + n);
    return this.n;
  }
}

class Producer extends Thread {
  Company c;
  Producer(Company c) {
    this.c = c;
  }
  public void run() {
    int i = 1;
    while (true) {
      this.c.produce_item(i);
      try {
        Thread.sleep(1000);
      } catch (Exception e) {
        e.printStackTrace();
      }
      i++;
    }
  }
}

class Consumer extends Thread {
  Company c;
  Consumer(Company c) {
    this.c = c;
  }
  public void run() {
    while (true) {
      this.c.consume_item();
      try {
        Thread.sleep(2000);
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}