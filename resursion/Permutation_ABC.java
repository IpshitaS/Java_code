package resursion;

public class Permutation_ABC {
    public static void main(String []args){
        String str ="abc";
        per(str, 0);
        System.out.println("recursion");
        printper(str, "");
    }
    public static void per(String str,int ind){
        String result = "";
        for(int i=0;i<str.length();i++){
            for(int j=0;j<str.length();j++){
                if(i!=j){
                    for(int k=0;k<str.length();k++){
                        if(i!=k&&j!=k){
                            result = "" + str.charAt(i) + str.charAt(j) + str.charAt(k);
                            System.out.println(result);   
                        }
                    }  
                }
                
            }
        }
        return;
    }
    public static void printper(String str, String per){
        if(str.length()==0){
            System.out.println(per);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentchar= str.charAt(i);
            String newstr = str.substring(0, i)+str.substring(i+1);
            printper(newstr, per+currentchar);
        }
    }
}
