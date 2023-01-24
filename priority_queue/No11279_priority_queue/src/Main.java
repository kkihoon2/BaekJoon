import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PriorityQueue<Integer> pri = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < num; i++) {
            int n = sc.nextInt();
            if (n == 0) {
                if (pri.isEmpty())
                    System.out.println("0");
                else System.out.println(pri.poll());
            }else pri.add(n);
        }
    }
}