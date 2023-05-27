package basic_code;
import java.util.*;
public class binToDec {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        int binNum = sc.nextInt();
        int decNum=0, d=0, i=0;;
        int temp=binNum;

        while(binNum>0){
            d = binNum%10;
            decNum += (d*Math.pow(2,i));
            i++;
            binNum /=10 ;
        }
        System.out.println("decimal of binary no. "+temp+" is :"+decNum);

        //octal to decimal
        int octNum = sc.nextInt();
        int r=0, j=0;;
        int temp1=octNum;
        decNum=0;
        while(octNum>0){
            r = octNum%10;
            decNum += (r*Math.pow(2,j));
            j++;
            octNum /=10 ;
        }
        System.out.println("decimal of binary no. "+temp1+" is :"+decNum);
    }
}
