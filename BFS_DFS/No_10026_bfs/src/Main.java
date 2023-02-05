import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int matrixSize ;
    static char[][]matrix;
    static int[] dirX;
    static int[] dirY;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        matrixSize = sc.nextInt();
        matrix = new char[matrixSize][matrixSize];
        for(int i = 0 ; i<matrixSize;i++)
        {
            String str = sc.next();
            for(int j = 0 ; j<matrixSize;j++)
            {
                matrix[i][j]=str.charAt(j);
            }

        }
        dirX = new int[]{-1,1,0,0};//상 하 좌 우
        dirY = new int[]{0,0,-1,1};
        boolean[][] visited = new boolean[matrixSize][matrixSize];
        int bfsCnt = 0 ;
        for(int i = 0 ; i<matrixSize ; i++){
            for(int j = 0 ; j<matrixSize;j++) {
                if(!visited[i][j]){
                    bfs(i,j,visited);
                    bfsCnt++;
                }

            }
        }
        System.out.print(bfsCnt+" ");
        visited = new boolean[matrixSize][matrixSize];
        int bfsCnt2 = 0;
        for(int i = 0 ; i<matrixSize;i++){
            for(int j = 0 ; j < matrixSize ; j++){
                if(matrix[i][j]=='G'){
                    matrix[i][j]='R';
                }
            }
        }

        for(int i = 0 ; i<matrixSize ; i++){
            for(int j = 0 ; j<matrixSize;j++) {
                if(!visited[i][j]){
                    bfs(i,j,visited);
                    bfsCnt2++;
                }

            }
        }
        System.out.print(bfsCnt2);


    }

    static void bfs(int x , int y, boolean[][]visited){
        Queue<Character>queue = new LinkedList<>();
        queue.add(matrix[x][y]);
        visited[x][y]=true;
        while(!queue.isEmpty())
        {
            char cur = queue.poll();
            for(int i = 0 ; i < 4; i++)
            {
                int nowX = x+dirX[i];
                int nowY = y+dirY[i];

                if(nowX>=0&&nowY>=0&&nowX<matrixSize&&nowY<matrixSize&&!visited[nowX][nowY]&&matrix[nowX][nowY]==cur)
                {
                    queue.add(matrix[nowX][nowY]);
                    visited[nowX][nowY]=true;
                }
            }
        }


    }










    //    static void dfs(int x,int y,boolean[][]visited)
//    {
//        visited[x][y]=true;
//        for(int i = 0 ; i < 4 ; i++)
//        {
//            int nowX = x+dirX[i];
//            int nowY = y+dirY[i];
//            if(nowX>=0&&nowY>=0&&nowX<matrixSize&&nowY<matrixSize&&matrix[x][y]==matrix[nowX][nowY]&&!visited[nowX][nowY])
//            {
//                dfs(nowX,nowY,visited);
//            }
//        }
//
//    }
}