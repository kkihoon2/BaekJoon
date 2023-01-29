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
        dirX = new int[]{-1,1,0,0};//상 하 좌 우 상좌 상우 하좌 하우
        dirY = new int[]{0,0,-1,1};
        boolean[][] visited = new boolean[matrixSize][matrixSize];
        int dfsCnt = 0 ;
        for(int i = 0 ; i<matrixSize ; i++){
            for(int j = 0 ; j<matrixSize;j++) {
                if(!visited[i][j]){
                    dfs(i,j,visited);
                    dfsCnt++;
                }

            }
        }
        System.out.print(dfsCnt+" ");
        visited = new boolean[matrixSize][matrixSize];
        int dfsCnt2 = 0;
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
                    dfs(i,j,visited);
                    dfsCnt2++;
                }

            }
        }
        System.out.print(dfsCnt2);

    }
    static void dfs(int x,int y,boolean[][]visited)
    {
        visited[x][y]=true;
        for(int i = 0 ; i < 4 ; i++)
        {
            int nowX = x+dirX[i];
            int nowY = y+dirY[i];
            if(nowX>=0&&nowY>=0&&nowX<matrixSize&&nowY<matrixSize&&matrix[x][y]==matrix[nowX][nowY]&&!visited[nowX][nowY])
            {
                dfs(nowX,nowY,visited);
            }
        }

    }
}