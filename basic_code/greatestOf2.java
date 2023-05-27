package basic_code;
import java.lang.*;
import java.util.*;

public class greatestOf2{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b)System.out.println(a);
        else System.out.println(b);
    } 
}