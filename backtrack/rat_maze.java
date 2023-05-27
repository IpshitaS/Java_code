package backtrack;
import java.util.*; 
public class rat_maze {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                maze[i][j] = sc.nextInt();
            }
        }
        //backtrack
        //int start = maze[0][0];
        //int end = maze[n-1][m-1];

        //int [][]path = new int[2][];
        //while(i<n && )
    }
}
