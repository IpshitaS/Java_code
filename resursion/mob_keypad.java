package resursion;

public class mob_keypad {
    public static String keypad[] = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void find(String st, int idx, String combination){
        if(idx==st.length()){
            System.out.println(combination);
            return;
        }
        char ch=st.charAt(idx);
        String curString = keypad[ch-'0'];
        //System.out.println(curString);
        for(int i=0;i<curString.length();i++){
            char c=curString.charAt(i);
            //System.out.println(c+" "+curString.length());
            find(st, idx+1, combination+c);
        }
    } 

    public static void main(String []args){
        String st = "23";
        find(st, 0, "");
    }
}
