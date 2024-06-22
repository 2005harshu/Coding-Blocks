import java.util.*;
public class Keypad_codes {
    static int a=0;
    static String[] arr={"","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yx"};
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String digits=sc.nextLine();
        keypad(digits,"");
        System.out.println();
        System.out.println(a);
    }
    private static void keypad(String digits,String ans){
        if(digits.length()==0){
            a++;
            System.out.print(ans+" ");
            return;
        }
        String str=arr[digits.charAt(0)-'0'];
        for(int i=0;i<str.length();i++){
            keypad(digits.substring(1),ans+str.charAt(i));
        }
    }
}
