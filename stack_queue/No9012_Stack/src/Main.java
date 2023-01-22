import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();

        for (int i = 0; i < T; i++) {
            System.out.println(ps(in.next()));    // nextLine()쓰면 안된다.
        }

    }

    static String ps(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push('(');
            } else if (stack.empty())
            {
                return "NO";
            }else{
                stack.pop();
            }
        }

        if(stack.empty()) {
            return "YES";
        }
        else {
            return "NO";
        }

    }
}