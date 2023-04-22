package string;

public class Basicstring5 {
    public static void main(String[] args) {
        String str = "jyotiradutya";
        String nstr = " ";
        char ch;
        for(int i=0; i<str.length();i++){
            ch= str.charAt(i);
            nstr =ch+ nstr;
        }
        System.out.println(nstr+" ");
    
        //   int n = 5;
        //   for (int i = 1; i <= n; i++) {
        //     for (int j = i; j >= 1; j--) {
        //       System.out.print(j + " ");
        //     }
        //     System.out.println();
        //   }
        // }
    }
  }