import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int sis ;
    static int bro ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sis = sc.nextInt();
        bro = sc.nextInt();
        int cnt = 0;
        Queue<Integer> k = new LinkedList<>();
        int[] visited = new int[100001];
        if(sis==bro){
            System.out.println("0");
        }else System.out.println(bfs(visited));
    }
    static int bfs(int[] visited){
        Queue<Integer>queue = new LinkedList<>();
        queue.add(sis);
        visited[sis]=1;
        while(!queue.isEmpty())
        {
            int cur = queue.poll();
            for(int i = 0 ; i <3;i++)
            {
                int next=0;
                if(i==0)
                {
                    next = cur * 2;
                } else if (i==1) {
                    next = cur - 1;
                } else if (i==2) {
                    next = cur+1;
                }
                if(next==bro){
                    return visited[cur];
                }
                if(next>=0&&next<visited.length&&visited[next]==0){
                    queue.add(next);
                    visited[next]=visited[cur]+1;
                }
            }
        }
        return -1;
    }
}
//public class Main {
//    static int Sis;
//    static int Bro;
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        Sis = sc.nextInt();
//        Bro = sc.nextInt();
//        ArrayList<Integer> list = new ArrayList<>();
//
//        while(true) {
//            boolean[] visited = new boolean[Bro + 20];
//            int temp = Sis;
//            dfs(temp, list, 0, visited);
//            for (Integer k : list) {
//                System.out.print(k);
//            }
//            System.out.println();
//        }
//
//    }
//
//    static void dfs(int temp, ArrayList<Integer> list, int cnt, boolean[] visited) {
//        if (temp == Bro&&!list.contains(cnt)) {
//            list.add(cnt);
//            return;
//        }
//        for (int i = 0; i < 3; i++) {
//            if (i == 0) {
//                temp = temp + 1;
//            } else if (i == 1) {
//                temp = temp - 1;
//            } else if (temp == 2) {
//                temp = temp * 2;
//            }
//            if ( temp < visited.length && temp >= 0&&!visited[temp]) {
//                visited[temp] = true;
//                dfs(temp, list, cnt + 1, visited);
//            } else if (temp> visited.length) {
//                return;
//            }
//        }
//    }
//}