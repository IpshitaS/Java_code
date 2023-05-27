package resursion;

public class permutation {
    public static void main(String []args){
        int n = 5;
        int r = resu(n);
        System.out.println(r);
    } 
    public static int resu(int n){
        if(n==1) return 1;

        int per=resu(n-1);
        int perr =  n*per;
        return n;
    }
}