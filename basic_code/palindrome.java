package basic_code;
import java.util.*;
public class palindrome {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int d=0,pal=0;
        while(num>0){
            d = num%10;
            pal = pal*10+d;
            num = num/10;
        }
        if(pal == temp)
        System.out.println(temp+" is palindrome");
        else
        System.out.println(temp+" is palindrome");
    }
}
