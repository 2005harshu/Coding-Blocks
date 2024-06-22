import java.util.*;
public class Subsequence {
    static int a=0;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sq(str,0,"");
        System.out.println();
        System.out.println(a);
    }
    private static void sq(String str,int i,String s){
        if(i==str.length()){
            a++;
            System.out.print(s+" ");
            return;
        }
        sq(str,i+1,s);
        sq(str,i+1,s+str.charAt(i));
    }
}
