package basic_code;
import java.util.*;
//import java.lang.*;
public class powerOfNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int pow = sc.nextInt();
        power ob = new power();
        int power = ob.Power(n, pow);
        System.out.println(power);
    }
}
class power{
    public int Power(int n,int pow){
        int power = 1;
        for(int i=0;i<pow;i++){
            power *= n;
        }
        return power;
    }
}