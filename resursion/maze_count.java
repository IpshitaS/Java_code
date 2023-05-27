package resursion;

public class maze_count {
    public static int  printcount(int m, int n,int i, int j){
        if(i==n-1 || j==m-1){
            System.out.println("A");
            return 1;
        }
        System.out.println('B');
        int down = printcount(m, n, i+1, j);
        System.out.println('c');
        int side = printcount(m, n, i ,j+1);
        System.out.println('d');
        return down+side;
    }
    public static void main(String []args){
        int m=3, n=3;
        int count = printcount(m, n, 0, 0);
        System.out.println(count);
    }
}
