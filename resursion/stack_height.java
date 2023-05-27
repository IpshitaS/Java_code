package resursion;

public class stack_height {
    public static void main(String []args){
        int n=6;
        int x =2;
        height ob = new height();
        //stack height "n"
        int hei = ob.hprint(n, x);
        System.out.println(hei);
        //stack height "log n"
        if(n%2==0){
            hei = ob.hprint(n/2, x);
            System.out.println(hei*hei);
        }
        else{
            hei = ob.hprint(n/2, x);
            System.out.println(hei*hei*x);
        }
    }
}
class height{
    public static int hprint(int n, int x){
        if(n==0) return 1;
        if(x==0) return 0;
        //System.out.println(h);
        int h = x*hprint(n-1, x);
        return h;
    }
}