package string;
import java.util.Scanner;
public class Bwstring {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str = sc.nextLine();
    String nstr = " ";
    for(int i=0; i<str.length(); i++){
        char ch= str.charAt(i);
        if(ch=='a'||ch=='e'||ch=='o'||ch=='u'){
            nstr +=ch;
        }
    }
    System.out.println(nstr);

}
}