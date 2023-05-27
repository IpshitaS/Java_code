package basic_code;
//import java.lang.*;
import java.util.*;
public class greatestOf3 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 no : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int big;
        big = ((a>b && a>c)?a:(b>a && b>c)?b:c);
        System.out.println(big);
    }
}
