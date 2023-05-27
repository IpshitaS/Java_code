package basic_code;
import java.util.*;
public class fibonacci {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int temp=0;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<num;i++){
            temp = a+b;
            System.out.print(temp+" ");
            a=b;
            b=temp;
        }

    }
}
