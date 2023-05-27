package pattern;

public class diamond {
    public static void main(String []args){
        int n = 5;
/*    
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    * 
*/
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
     *
   *  * 
  *    *
 *      *  
*        *  
*        *
 *      *
  *    *  
   *  * 
     *
         */
        System.out.println();
         for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        /*
*
* *
* * *
* * * *
* * * * * 
* * * *
* * * 
* *
*        
        */    
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        } 
        for(int i=n-1;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
*
* 1 *
* 1 2 1 *
* 1 2 3 2 1 *
* 1 2 1 *
* 1 *
*
        */   
        System.out.println();
        n=3;
        System.out.println("* ");
        for(int i=1;i<=n;i++){
            System.out.print("* ");
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.print("* "+"\n");
        }
        for(int i=n-1;i>0;i--){
            System.out.print("* ");
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            for(int j=i-1;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.print("* "+"\n");
        }
        System.out.println("* ");
    }
}
