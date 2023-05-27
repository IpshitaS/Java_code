package basic_code;
import java.util.*;
public class n_prime {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        boolean flag=false;
        
        for(int i=1;i<=num;i++){
            flag=true;
            for(int j=2;j<i;j++){
                if(i%j ==0){
                    flag=false;
                }
            }
            if(flag == true)
            System.out.println(i);
        }
    }
}