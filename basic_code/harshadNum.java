package basic_code;
import java.util.*;
// 1729
// 1+7+2+9 = 19
// 1729%19 == 0 -- YES
public class harshadNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0, temp=num;
        while(temp>0){
            sum += temp%10 ;
            temp = temp/10;
        }
        int res = num%sum;
        System.out.println(sum+" "+res);
        if(res == 0)
        System.out.println(num+" Harshad Num");
        else
        System.out.println(num+" Not Harshad Num");
    }
}
