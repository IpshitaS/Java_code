package basic_code;
import java.util.*;
public class automorphicNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;
        int sq = num*num;
        while(num>0){
            if(num%10 != sq%10)
                flag=false;
            num /= 10;
            sq /=10;
        }
        if(flag == true)
        System.out.println("Automorphic number");
        else
        System.out.println("not Automorphic number");
    }
}
