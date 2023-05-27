package basic_code;
import java.util.*;

public class remVowel {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.nextLine();
        //Close.Scanner();
        String rev="";

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch =='A' || ch=='e' || ch =='E' 
            || ch=='i' || ch =='I' || ch=='o' || ch =='O' 
            || ch=='u' || ch =='U'){ continue;}
            else rev += ch;
        }
        System.out.println(rev);
    }
}
