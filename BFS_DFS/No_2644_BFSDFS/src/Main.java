import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int n;
    static int find1;
    static int find2;
    static int relationNum;
    static int[][] relation;
    static int[][] matrix;
    static int result = -1;
    static boolean[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        find1 = sc.nextInt();
        find2 = sc.nextInt();
        relationNum = sc.nextInt();
        relation = new int[relationNum][2];
        for (int i = 0; i < relationNum; i++) {
            for (int j = 0; j < relation[i].length; j++) {
                relation[i][j] = sc.nextInt();
            }
        }
        matrix = new int[n + 1][n + 1];
        for (int i = 0; i < relation.length; i++) {
            matrix[relation[i][0]][relation[i][1]] = 1;
            matrix[relation[i][1]][relation[i][0]] = 1;
        }
        visited = new boolean[n + 1];

        dfs(find1,0);
        System.out.println(result);
    }

    public static void dfs( int now,int cnt) {
        visited[now] = true;
        if (now == find2) {
            result = cnt;
            return;
        }
        for (int i = 0; i < n + 1; i++) {

            if (matrix[now][i] == 1 && !visited[i]) {
                dfs(i,cnt+1);
            }
        }

    }
}

//        for (int i = 0; i < n + 1; i++) {
//            for (int j = 0; j < n + 1; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }


//    public static int bfs() {
//        boolean[] visited = new boolean[n + 1];
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(find1);
//        visited[find1] = true;
//        int cnt = 0;
//
//        while (!queue.isEmpty()) {
//            int cur = queue.poll();
//            if (cur == find2) {
//                return cnt;
//            }
//            for (int i = 0; i < matrix.length; i++) {
//                if (matrix[cur][i] == 1 && !visited[i]) {
//                    cnt++;
//                    visited[i] = true;
//                    System.out.println(i);
//                    queue.add(i);
//                    break;
//                }
//            }
//
//        }
//
//
//        return -1;
//    }
