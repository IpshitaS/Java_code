package basic_code;
import java.util.*;
public class sum2fracction {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int den1 = sc.nextInt();
        int num2 = sc.nextInt();
        int den2 = sc.nextInt();

        int sum_n = (num1*den2)+(num2*den1);
        int sum_d = (den1*den2);
        int gcf=1;
        for(int i=2;i<sum_n && i<sum_d;i++){
            if(sum_n%i == 0 && sum_d%i == 0){
                gcf = i;
            }
        }
        System.out.println(sum_n/gcf+" "+sum_d/gcf);
    }
}
