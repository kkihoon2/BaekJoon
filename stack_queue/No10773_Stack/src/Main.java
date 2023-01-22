import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int answer = 0 ;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i<count;i++){
            int k = sc.nextInt();
            if(k == 0){
                stack.pop();
            }else stack.push(k);
        }
        while (stack.size() > 0) answer += stack.pop();
        System.out.print(answer);
    }
}