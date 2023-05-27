package pattern;

public class way {
    public static int ways(int n){
        if(n<=1){
            return 1;
        }
        int single = ways(n-1);
        int pair = (n-1)*ways(n-2);
        return single + pair;
    }
    public static void main(String []args){
        int n=4;
        int count = ways(n);
        System.out.println(count);
    }
}
