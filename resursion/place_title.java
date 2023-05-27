package resursion;
// (m,n) maze size and have to fit (1,n) size tiles to the maze
public class place_title {
    public static int print(int m, int n){
        if(m==n){
            System.out.println((11));
            return 2;
        }
        if(n>m){
            System.out.println(12);
            return 1;
        }
        System.out.println(15);
        int right = print(m-n, n);
        System.out.println(13);
        int down = print(m-1,n);
        System.out.println(14);
        return right+down;
    }
    public static void main(String[] args){
        int m=5, n=2;
        int count = print(m, n);
        System.out.println(count);
    }
}
