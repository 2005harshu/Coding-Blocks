import java.util.*;
public class Tower_0f_Hanoi {
    public static void main(String args[]) {
         Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        print(num,'A','B','C');
    }
    public static void print(int num,char s1, char s2,char s3){
        if(num==1){
            System.out.println("Moving ring 1 from "+s1+ " to "+s2);
            return;
        }
        print(num-1,s1,s3,s2);
        System.out.println("Moving ring "+ num+ " from "+ s1+" to "+s2);
        print(num-1,s3,s2,s1);

    }
}

