import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vertexNum = sc.nextInt()+1;
        int edgeN=sc.nextInt();
        int startNum = sc.nextInt();
        List<Integer[]>edgeList = new ArrayList<>();
        for(int i = 0 ; i<edgeN;i++)
        {
            int edgeX = sc.nextInt();
            int edgeY = sc.nextInt();
            edgeList.add(new Integer[]{edgeX,edgeY});
        }
        int[][] matrix = new int[vertexNum][vertexNum];
        for(int i = 0 ; i<edgeN;i++){
            int x = edgeList.get(i)[0];
            int y = edgeList.get(i)[1];
            matrix[x][y]=1;
            matrix[y][x]=1;
        }

        boolean[]checked = new boolean[vertexNum];
        int k = startNum;
        dfs(k,matrix,checked);

        System.out.println();

        checked = new boolean[vertexNum];

        Queue<Integer> queue = new LinkedList<>();
        bfs(startNum,matrix,checked,queue,vertexNum);

    }
    static void bfs(int startNum,int[][]matrix,boolean [] checked,Queue<Integer>queue,int vertexNum)
    {
        queue.add(startNum);
        checked[startNum]=true;
        System.out.print(startNum+ " ");
        while(!queue.isEmpty())
        {
            int temp = queue.poll();
            for(int j = 1 ; j<vertexNum;j++)
            {
                if(checked[j]==false&&matrix[temp][j]==1)
                {
                    queue.offer(j);
                    checked[j]=true;
                    System.out.print(j + " ");
                }
            }
        }

    }

    static void dfs(int startNum,int[][]matrix,boolean [] checked)
    {
        checked[startNum]=true;
        System.out.print(startNum+" ");
        for(int i = 0 ; i< matrix.length;i++){
            if(matrix[startNum][i]==1&&checked[i]==false)
            {
                checked[startNum]=true;
                dfs(i,matrix,checked);
            }
        }
    }

}