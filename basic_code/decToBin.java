package basic_code;
import java.util.*;
public class decToBin {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        //decimal to
        int decNum = sc.nextInt();
        int binNum = 0, r=0, i=1;
        int temp = decNum;
        while(temp>0){
            r = temp%2;
            binNum = binNum + (r*i) ;
            temp /=2;
            i *=10;
        }
        System.out.println("binary of decimal no. "+decNum+" is : "+binNum);

        //decimal to octal
        int octNum = 0, rem=0, j=1;
        int temp1 = decNum;
        while(temp1>0){
            rem = temp1%8;
            octNum = octNum + (rem*j) ;
            temp1 /=8;
            j *=10;
        }
        System.out.println("binary of decimal no. "+decNum+" is : "+octNum);

    }
}
