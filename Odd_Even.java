import java.util.*;
public class Odd_Even {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=num;i>0;i--){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        for(int i=1;i<=num;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
