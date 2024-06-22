import java.util.*;
public class Nth_triangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int ele=sc.nextInt();
        System.out.println(print(ele));
    }
    private static int print(int ele){
        if(ele==0){
            return 0;
        }
        int sp=print(ele-1);
        int bp=sp+ele;
        return bp;
    }
}
