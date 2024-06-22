import java.util.*;
public class Recursion_twins {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(twin(str));
    }
    private static int twin(String str){
        if(str.length()<3){
            return 0;
        }
        char ch1=str.charAt(0);
        char ch2=str.charAt(2);
        if(ch1==ch2){
            return 1+twin(str.substring(1));
        }
        else{
            return twin(str.substring(1));
        }
    }
    
}
