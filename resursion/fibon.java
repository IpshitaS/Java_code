package resursion;
import java.util.*;
import java.lang.*;
public class fibon {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=0,b=1;
        System.out.print(a+" "+b+" ");
        recs ob = new recs();
        ob.printfib(a, b, n-2);
        System.out.println();
    }
}
class recs{
    public void printfib(int a,int b,int n){
        if(n==0){
            return;
        }
        int c = a+b;
        System.out.print(c+" ");
        printfib(b, c, n-1);
    }
    
}