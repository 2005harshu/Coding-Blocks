import java.util.*;
public class Replace_All_pi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++){
            str[i]=sc.next();
        }
        printpi(str,"");
    }
    private static void printpi(String[] str,String ans){
        String s="";
        for(int i=0;i<str.length;i++){
            s=str[i];
            ans=s.replace("pi","3.14");
            str[i]=ans;
            System.out.println(ans);
        }
        return;
    }
}
