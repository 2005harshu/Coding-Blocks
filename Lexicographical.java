import java.util.*;
public class Lexicographical {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        order(n,0);
    }
    private static void order(int n,int ans){
        if(ans<=n){
            System.out.println(ans+" ");
        }
        if(ans>n){
            return;
        }
        int i=0;
        if(ans==0){
            i=1;
        }
        for(;i<=9;i++){
            order(n,ans*10+i);
        }
    }
}
