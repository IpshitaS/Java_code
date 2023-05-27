package basic_code;
import java.util.*;
public class factorOfNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        factor ob = new factor();
        ob.fact(num);
    }
}
class factor{
    void fact(int n){
        
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.println(i);
            }
        }
    }
}
