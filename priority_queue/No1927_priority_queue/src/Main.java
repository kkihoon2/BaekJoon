import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PriorityQueue<Integer> pri = new PriorityQueue<>();
        for(int i = 0 ; i<num;i++)
        {
            int s = sc.nextInt();
            if(s==0){
                if(pri.isEmpty())
                    System.out.println("0");
                else
                    System.out.println(pri.poll());
            }else
            {
                pri.add(s);
            }

        }
    }

}