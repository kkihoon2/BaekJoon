import java.util.Scanner;
//못풀었음................................................
public class Main {
    static int X;
    static int Y;
    static int[][] map;

    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            X = sc.nextInt();
            Y = sc.nextInt();
            if(X==0&&Y==0)
                break;
            map = new int[X][Y];
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    map[i][j] = sc.nextInt();
                }
                System.out.println();
            }
            int[] moveX = {-1, 1, 0, 0, -1, -1, 1, 1};//상 하 좌 우 상좌 상우 하좌 하우
            int[] moveY = {0, 0, -1, 1, -1, 1, -1, 1};
            int dfsCount = 0;
            boolean[][] checked = new boolean[X][Y];
            for (int i = 0; i < X; i++) {
                for (int j = 0; j < Y; j++) {
                    if (map[i][j] == 1 && !checked[i][j]) {
                        dfsCount++;
                        dfs(i, j, checked, moveX, moveY);

                    }
                }
            }

            System.out.println(dfsCount);
        }
    }

    static void dfs(int nowX, int nowY, boolean[][] checked, int[] moveX, int[] moveY) {
        checked[nowX][nowY] = true;
        for (int i = 0; i < 8; i++) {
            nowX = nowX + moveX[i];
            nowY = nowY + moveY[i];
            if (nowX < X && nowY < Y && nowX >= 0 && nowY >= 0 && !checked[nowX][nowY] && map[nowX][nowY] == 1) {
                dfs(nowX, nowY, checked, moveX, moveY);
            }
        }
    }
}