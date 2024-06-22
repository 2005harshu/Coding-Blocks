import java.util.*;
public class Mapped_String {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        print(str,"");
    }
    public static void print(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        int d=Character.getNumericValue(str.charAt(0));
        if(d>=1 && d<=9){
            char ch=(char)(d-1+'A');
            print(str.substring(1),ans+ch);
        }
        if(str.length()>=2){
            int p=Integer.parseInt(str.substring(0,2));
            if(p>=10 && p<=26){
                char ch=(char)(p-1+'A');
                print(str.substring(2),ans+ch);
            }
        }
    }
}


