package string;

public class Reverse {
    public static void main(String[] args) {
        String str= "manish";
        String nstr =" ";
        for(int i=0; i<str.length(); i++){
             char ch = str.charAt(i);
             nstr =ch+nstr;       
        }
        System.out.println(nstr);

    }
}
