import java.util.*;
public class Replace_hi2 {
        static int a=0;
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            String str=sc.next();
            countandreplace(str,"");
            remove(str,"");
        }
        private static void countandreplace(String str,String s){
            if(str.isEmpty()){
                System.out.println(a);
                System.out.println(s);
                return;
            }
            char ch=str.charAt(0);
            if(str.startsWith("hi") && !str.startsWith("hit")){
                a++;
                 countandreplace(str.substring(2),s);
            }else{
                 countandreplace(str.substring(1),s+ch);
            }
        }
        private static void remove(String str,String s) {
            if(str.isEmpty()){
                System.out.println(s);
                return;
            }
            char ch=str.charAt(0);
            if(str.startsWith("hi") && !str.startsWith("hit")){
                remove(str.substring(2),s+"bye");
            }else{
                remove(str.substring(1),s+ch);
            }
        }
    
}
