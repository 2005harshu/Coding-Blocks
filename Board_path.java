import java.util.*;
public class Board_path {
    static int a=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        paths(n,m,0,"");
        System.out.println();
        System.out.println(a);
    }
    private static void paths(int n,int m,int idx,String s){
        if(idx==n){
            a++;
            System.out.print(s+" ");
            return;
        }
        for(int i=1;i<=m && idx+i<=n;i++){
            paths(n,m,idx+i,s+i+"");
        }
    }
}
