package basic_code;
import java.util.*;
public class binToOct {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int binNum = sc.nextInt();
        int dec = 0, oct =0, r=0, i=0;
        int temp=binNum;
        while(temp>0){
            r = temp%10;
            dec += (r*Math.pow(2,i));
            i++;
            temp /=10 ;
        }
        System.out.println("binary to decimal of "+binNum+" is :"+dec);
        r=0; i=1;
        temp=binNum;
        while(temp>0){
            r = r%8;
            oct = oct+ (r*i);
            i *=10;
            temp /= 8;
        }
        System.out.println("decimal to octal of "+dec+" is :"+oct);
    }
}
