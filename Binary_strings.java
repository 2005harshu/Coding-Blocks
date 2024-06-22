import java.util.*;
public class Binary_strings {
    static int count=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        for(int i=0;i<len;i++){
            String str=sc.next();
            char[] ch=str.toCharArray();
            print(ch,0);
        }
        System.out.println(count);
        //char[] ch=str.toCharArray();
    }
    private static void print(char[] ch,int idx){
        if(idx==ch.length){
            count++;
            System.out.print(new String(ch)+" ");
            return;
        }
        if(ch[idx]=='?'){
            ch[idx]='0';
            print(ch,idx+1);
            ch[idx]='1';
            print(ch,idx+1);
            ch[idx]='?';
        }
        else{
            print(ch,idx+1);
        }
    }
}
