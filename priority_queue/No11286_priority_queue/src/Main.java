import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> queue= new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //절대값 기준으로 앞 값이 더 크다면 자리를 바꿔준다.
                if(Math.abs(o1) > Math.abs(o2)) {
                    return Math.abs(o1) - Math.abs(o2);
                    //절대값 기준으로 두 값이 같다면 음수를 앞으로 보내준다.
                }else if(Math.abs(o1) == Math.abs(o2)) {
                    return o1 - o2;
                }else {
                    return -1;
                }
            }
        });
        for(int i = 0 ; i<n;i++)
        {
            int input = sc.nextInt();
            if(input==0)
            {
                if(queue.isEmpty())
                    System.out.println("0");
                else System.out.println(queue.poll());
            }else queue.add(input);
        }
    }
}