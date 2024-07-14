
import java.util.*;
import java.util.Scanner;
public class zig_zag {
	
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int s = scan.nextInt();
	        int si = scan.nextInt();
	        int[][] arr = new int[s][si];
	        for (int i = 0; i < s; i++) {
	            for (int j = 0; j < si; j++) {
	                arr[i][j] = scan.nextInt();
	            }
	        }
	        Multithread obj = new Multithread(s, si, arr);
	        Thread t = new Thread(obj);
	        t.start();
	    }
	}

	class Multithread implements Runnable {
	    private int s;
	    private int si;
	    private int[][] arr;

	    public Multithread(int s, int si, int[][] arr) {
	        this.s = s;
	        this.si = si;
	        this.arr = arr;
	    }

	    @Override
	    public void run() {
	        int sum = 0;
	        for (int i = 0; i < s; i++) {
	            for (int j = 0; j < si; j++) {
	                if (i == 0) {
	                    sum += arr[i][j];
	                }
	                if (i == s - 1) {
	                    sum += arr[i][j];
	                }
	                if (i == 1 && j == 1) {
	                    sum += arr[i][j];
	                }
	            }
	        }
	        System.out.print(sum);
	    }
	}


