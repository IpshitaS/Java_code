package basic_code;
import java.util.*;
//The divisors of 12 
//1+2+3+4+6 = 16
//12<16 ---YES
public class abundantNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int abu = 0;

        for(int i=1;i<num;i++){
            if(num%i==0){
                abu+=i;
            }
        }
        if(abu > num)
        System.out.println(num+" Abundant Num");
        else
        System.out.println(num+" Not Abundant Num");
    }
}
