import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] time = new int[num];
        for (int i = 0; i < num; i++) {
            time[i] = sc.nextInt();
        }
        Arrays.sort(time);
        int result = 0 ;
        for (int i = 0; i < time.length; i++) {
            int temp = 0 ;
            for (int j = 0; j <= i; j++) {
                temp = temp + time[j];
            }
            result = result +temp;
        }
        System.out.print(result);
    }
}