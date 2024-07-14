
import java.util.*;
class Counter {
  int c = 0;

  public synchronized void increment() {
    c++;
  }
}

public class anonymous_function {

  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    Thread thread1 = new Thread(() -> counter.increment());
    Thread thread2 = new Thread(() -> counter.increment());

    thread1.start();
    thread2.start();

    thread1.join();
    thread2.join();

    System.out.println("Final count: " + counter.c);
  }
}