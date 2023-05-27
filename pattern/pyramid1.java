package pattern;
import java.util.*;
public class pyramid1 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        /* o/p:- num = 5
        1 
        1 2 1
        1 2 3 2 1
        1 2 3 4 3 2 1
        1 2 3 4 5 4 3 2 1 */
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        /* o/p:- num = 5
        A
        A  B  A
        A  B  C  B  A
        A  B  C  D  C  B  A
        A  B  C  D  E  D  C  B  A */
        System.out.println();
        for(int i=1;i<=num;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }ch--;
            for(int j=i-1;j>=1;j--){
                ch--;
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        /* o/p:- num = 5
                1
              1  2  1
            1  2  3  2  1
          1  2  3  4  3  2  1
        1  2  3  4  5  4  3  2  1 */
        System.out.print("  ");
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>=1;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        /* *******1********
           *******2*2*******
           ******3*3*3******
           *****4*4*4*4*****
           ****5*5*5*5*5****
           ***6*6*6*6*6*6*** */
          System.out.println();
          for(int i=1;i<num;i++){
            if(i==1){
                for(int j=i;j<=num;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i+"*");
                }
                for(int j=i;j<=num;j++){
                    System.out.print("*");
                } 
            }
            else{
                for(int j=i-1;j<=num;j++){
                    System.out.print("*");
                }
                for(int j=1;j<=i;j++){
                    System.out.print(i+"*");
                }
                for(int j=i;j<=num;j++){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        System.out.println();
/*1
  01
  101
  0101
  10101 */
        int a=5;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print(1);
                }
                else
                System.out.print(0);
            }
            System.out.println();
        }
        System.out.println();
        /*
    *****
   *****
  *****
 *****
***** */
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        /*
    1 
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5 */
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        /*
    1
   212
  32123
 4321234
543212345 */
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print(" ");
            }
            int k=i;
            for(int j=a-i+1;j<=a;j++){
                System.out.print(k--);
            }
            k=1;
            for(int j=1;j<=i-1;j++){
                System.out.print(++k);
            }
            System.out.println();
        }   
        System.out.println();
        /*
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
         */
        a=4;
        for(int i=1;i<=a;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*(a-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }     
        for(int i=a-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=2*(a-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
/*
      *
    * * * 
  * * * * *
* * * * * * *
 * * * * * * *
  * * * * *
    * * *
      * 
*/
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
        System.out.print(" ");
        for(int i=a;i>0;i--){
            for(int j=1;j<=a-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }  
        System.out.println();
        /*
    1
   1 1
  1 2 1
 1 3 3 1
1 4 6 4 1
         */
    }
}
