package resursion;
import java.util.*;
public class move_char {
    public static String s1="";
    public static String s2="";
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        char ch = sc.next().charAt(0);
        String str = sc.next();
        String result = move(str, ch,0);
        System.out.println(result);
    }
    public static String move(String str,char ch, int n){
        if(n==str.length()){
            return (s1+s2);
        }
        char c= str.charAt(n);
        if(c==ch){
            s2 = s2+c;
        }
        else{
            s1 = s1+c;
        }
        return move(str, ch, n+1);
    }
}
