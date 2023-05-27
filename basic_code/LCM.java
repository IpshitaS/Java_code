package basic_code;
import java.lang.*;
import java.util.*;
public class LCM {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm=1;
        for(int i=2;i<a && i<b;i++){
            if(a%i==0 && b%i == 0){
                lcm=i;
            }
        }
        lcm = lcm*(a/lcm)*(b/lcm);
        System.out.println(lcm);
    }
}
