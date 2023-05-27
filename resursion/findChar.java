package resursion;
import java.util.*;

public class findChar {
    public static int first =-1;
    public static int last = -1;
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String s=sc.next();
        find(ch, s, 0);
        
    }
    public static void find(char ch, String s, int i){      
        if(i==s.length()){
            System.out.println("first index : "+first);
            System.out.println("last index : "+last);
            return;
        }
        char c = s.charAt(i);
        if(ch==c){
            if(first == -1)     first=i;
            else  last=i;
        }
        find(ch,s,i+1);
    }
}
