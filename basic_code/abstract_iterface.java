package basic_code;

public class abstract_iterface {
    public static void main(String[] args) {
        i1 ob1=new c1();
        ob1.m2();
        c2 ob = new c3();
        ob.m3();
        ob.m5();
    }
}
interface i1{
    public void m1();
    public void m2();
}
class c1 implements i1{
    public void m1(){}
    public void m2(){
        System.out.println("CLASS 1 METHOD 1");
    }
}

abstract class c2{
    abstract void m3();
    abstract void m4();
    void m5(){
        System.out.println("class abstract method 5");
    }
}
class c3 extends c2{
    void m3(){
        System.out.println("class abstract method 3");
    }
    public void m4(){}
}