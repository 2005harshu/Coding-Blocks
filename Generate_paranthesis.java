import java.util.*;
public class Generate_paranthesis {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> c=genp(n);
        for(int i=c.size()-1;i>=0;i--){
            System.out.println(c.get(i));
        }
    }
    private static ArrayList<String> genp(int n){
        ArrayList<String> li=new ArrayList<>();
        gp("",0,0,n,li);
        return li;
    }
    private static void gp(String s,int i,int j,int n,ArrayList<String> li){
        if(s.length()==n*2){
            li.add(s);
        }
        if(i<n){
            gp( s+'(',i+1,j,n,li);
        }
        if(j<i){
            gp(s+')',i,j+1,n,li);
        }
    }
}