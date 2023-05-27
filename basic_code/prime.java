package basic_code;
import java.util.*;
public class prime {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 0;
        for(int i=2;i<=num/2;i++){
            if(num%i == 0){
                System.out.println("Not prime");
                flag = 1;
                break;
            }
        }
        if(flag == 0)
            System.out.println("Prime");
    }
}
