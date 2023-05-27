package basic_code;
import java.util.*;
// 6 = 1+2+3 --divisor or 6
// 28 = 1+2+4+7+14
public class perfectNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int per=0;
        for(int i=1;i<num;i++){
            if(num%i == 0)
                per += i; 
        }
        if(per == num)
        System.out.println(per+" perfect num");
        else
        System.out.println(per+" perfect num");
    }
}
