import java.util.*;
public class String_to_Int {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(print(str));
    }
    private static int print(String str){
        int val=Integer.valueOf(str);
        return val;
    }
}
