import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] coin = new int[]{500,100,50,10,5,1};
        Scanner sc = new Scanner(System.in);
        int change = 1000-sc.nextInt();
        int cnt = 0 ;
        for(int i = 0 ; i<coin.length;i++)
        {
            cnt = cnt + change/coin[i];
            change = change%coin[i];
        }
        System.out.print(cnt);
    }
}