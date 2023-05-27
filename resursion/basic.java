package resursion;
import java.util.*;

public class basic{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rec ob = new rec();
        ob.print(n);
    }
}
class rec{
    public int i=0;
    public void print(int n){
        i++;
        if(i<=n){
            System.out.println(i);
            print(n);
        }
        else return;
        
    }
}