import java.util.*;
public class Stairs_jump {
        static int a=0;
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int k=ways(n,"");
            System.out.println(k);
            System.out.println(a);
        }
        private static int ways(int n,String s){
            if(n<0){
                return 0;
            }
            if(n==0){
                System.out.println(s);
                a++;
                return 1;
            }
            int a=ways(n-1,s+1);
            int b=ways(n-2,s+2);
            int c=ways(n-3,s+3);
            return a+b+c;
        }
    }
