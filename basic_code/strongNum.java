package basic_code;
import java.util.*;
// 145 = 1!+4!+5! = 145
public class strongNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d=0, fact, flag=0, temp=num;
        while(num>0){
            d = num%10;
            fact =1;
            for(int i=d;i>0;i--){
                fact *= d;
                d--;
            }
            flag +=fact;
            num = num/10;
        }
        if(flag == temp)
             System.out.println(temp+" Strong Num "+flag);
        else    
        System.out.println(temp+" Not Strong Num "+flag);
    }   
}
