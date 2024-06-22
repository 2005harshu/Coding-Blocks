import java.util.*;
public class Replace_hi {
    static int a=0;
    public static void main(String args[]) {
       Scanner sc =new Scanner(System.in);
       String str=sc.next();
       hii(str,0,"");
       System.out.println(hii(str,0));
    }
    private static void hii(String str,int i,String s){
        if(i>=str.length()-1){
            System.out.println(a);
            System.out.println(s+str.charAt(str.length()-1));
            return;
        }
        if(str.substring(i,i+2).equals("hi")){
            a++;
            hii(str,i+2,s);
        }
        else{
            hii(str,i+1,s+str.charAt(i));
        }
    }
    private static String hii(String str,int idx){
        if(idx>=str.length()){
            return "";
        }
        if(str.startsWith("hi",idx)){
            return "bye"+hii(str,idx+2);
        }
        else{
            return str.charAt(idx)+hii(str,idx+1);
        }
    }

}
