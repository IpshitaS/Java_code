package resursion;
import java.util.*;

public class string_rev {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int l= s.length();
        if(l==0){
            System.out.println("no string");
            return;
        }
        print_string ob = new print_string();
        String st = ob.printS(s, l-1);
        System.out.println(st);
    }
}
class print_string{
    public static String printS(String s, int l){
        String st="";
        char ch = s.charAt(l);
        if(l==0){
            st = st+ch;
            return st;
        }
        st= ch+""+printS(s, l-1);
        return st;
    }
}