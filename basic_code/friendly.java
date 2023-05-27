package basic_code;
import java.util.*;
//Friendly pair or not (Amicable or not)
//(Sum of divisors of 6)/6 = (Sum of divisors of 28)/28.
public class friendly {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int s1=0,s2=0;
        for(int i=1;i<n1;i++){
            if(n1%i==0){
                s1 +=i;
            }
        }
        for(int i=1;i<n2;i++){
            if(n2%i==0){
                s2 +=i;
            }
        }
        System.out.println(s1+" "+s2);
        if(s1/n1 == s2/n2)
            System.out.println(n1+" & "+n2+" are Friendly no.");
        else
            System.out.println(n1+" & "+n2+" are not Friendly no.");
    }
}
