package resursion;
import java.util.*;

public class subset {
    
    public static void set(String str, int i, String newS){
        if(i==str.length()){
            System.out.println(newS);
            return;
        }
        //want to add
        set(str, i+1, newS+str.charAt(i));

        //not want to add
        set(str, i+1, newS);
    }
    // To get unique element we can use HashSet
    public static void unique_set(String str, int i, String newS, HashSet<String> set){
        if(i==str.length()){
            if(set.contains(newS)==true) return;
            else{
                System.out.println(newS);
                set.add(newS);
                return;
            }
        }
        //want to add
        unique_set(str, i+1, newS+str.charAt(i), set);

        //not want to add
        unique_set(str, i+1, newS, set);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String str1=sc.next();
        HashSet<String> set = new HashSet<>();
        
        set(str, 0, "");
        unique_set(str1, 0, "", set);
    }
}
