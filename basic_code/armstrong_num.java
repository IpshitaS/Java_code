package basic_code;
// 371 is an Armstrong number 
//since 3**3 + 7**3 + 1**3 = 371
import java.util.*;
public class armstrong_num {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int start = sc.nextInt();
        //int end = sc.nextInt();
        //int len = 0;
        int armstr=0, d=1,temp=num;

        //!armstrong between 2 no.
        //while(start>0)
        //{
        //    len++;
        //    d=start/10;
        //}
        //System.out.println(len);

        //for(int i=start;i<=end;i++){
        //    temp=i;
        //    armstr=0;
        //    while(temp>0){
        //        d= temp%10;
        //        armstr += d*len;
        //        temp/=10;
        //    }
        //    if(i == armstr){
        //        System.out.println(armstr);
        //    }
        //}

        //!find no. is armstrong or not
        int len = String.valueOf(num).length();
        while(num>0){
            d = num%10;
            armstr += Math.pow(d,len);
            num = num/10;
        }
        if(temp == armstr) 
            System.out.println("Armstrong "+armstr +" "+temp);
        else
        System.out.println("Not Armstrong "+armstr +" "+temp);
    }
}
