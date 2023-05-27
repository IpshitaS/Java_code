package resursion;

public class sunOfN{
    public static void main(String []args){
        print(5,1,0);
    }
    public static void print(int n,int i,int s){
        if(i==n){
            s += i;
            System.out.println(s);
            return; 
        }
        s +=i;
        print(n,i+1 ,s);
    }
}
