package basic_code;
import java.util.*;
public class reverseNum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r=0, rev=0, sum=0;
        int temp = num;
        while(temp>0){
            r = temp%10;
            rev = rev*10 + r;
            sum += r; 
            temp /= 10;
            //System.out.println(r+" "+temp+" "+rev);
        }
        System.out.println("Reverse of "+num+" is : "+rev+" and sum of digit is "+sum);
    }
}
