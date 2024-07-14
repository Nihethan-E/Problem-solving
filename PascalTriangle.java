
import java.awt.AWTException;
public class PascalTriangle {
        public static void main(String[] args) throws AWTException {
        int a = 5;
        Thread c = new Thread(() -> {
            b(a);});
        bb bbThread = new bb(a);
        c.start();
        bbThread.start();}
    private static void b(int a) {}
    static class bb extends Thread {
        private int n;
        public bb(int n) {
            this.n = n;}
        @Override
        public void run() {
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int r = 0; r < i; r++) {
                    System.out.print(n(i - 1, r) + " ");
                }
                System.out.println();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {} }}
        static int n(int n, int r) {
            if (r == 0 || r == n) {
                return 1;
            }
            return n(n - 1, r - 1) + n(n - 1, r);}}}