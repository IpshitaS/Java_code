package resursion;
import java.util.*;

public class fact {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = print(n);
        System.out.println(fact);
    }
    public static int print(int n){
        if(n==0 || n== 1){
            return 1;
        }
        int f =n*print(n-1);
        return f;
    }
}
