package resursion;
import java.util.*;

public class check_sort {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean f = check(arr, 0);
        System.out.println(f);
    }
    public static boolean check(int[] arr,int i){
        boolean flag = false;
        if(i==arr.length-1){
            return flag;
        }
        if(arr[i]<arr[i+1]){
            flag=true;
            check(arr, i+1);
        }
        else{
        flag=false;
        }
        return flag;
    }
}
