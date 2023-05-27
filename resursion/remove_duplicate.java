package resursion;
import java.util.*;
public class remove_duplicate {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String newS= ""+str.charAt(0);
        remove(str,1,newS);
    }

    public static void remove(String str,int i, String newS){
        char ch = str.charAt(i);
        
        int a=0;
        for(int j=0;j<newS.length();j++){
            if(ch==newS.charAt(j)){
                a=1;
                break;
            }
            else a=0;
        }
        if(a==0) newS+=ch;
        if(i==str.length()-1){
            System.out.println(newS);
            return;
        }
        remove(str, i+1, newS);
    }
}
