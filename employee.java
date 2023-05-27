import java.util.*;

class employee{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee name : ");
        String name = sc.nextLine();
        System.out.print("Enter Employee age : ");
        int age = sc.nextInt();
        System.out.print("Enter Employee salary : ");
        int salary = sc.nextInt();

        System.out.println("Employee Name : "+name);
        System.out.println("Employee Age : "+age);
        System.out.println("Employee Salary : "+salary);
    }
}