import java.util.*;
public class N_Knight {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int [][]kn=new int[k][k];
        n_k(kn,k);
        for(String i:set){
            System.out.print(i+" ");
        }
        System.out.print("\n"+set.size());
    }
    static TreeSet<String> set=new TreeSet<>();
    public static void n_k(int[][] kn,int k){
        if(k==0){
            String ans="";
            for(int i=0;i<kn.length;i++){
                for(int j=0;j<kn[0].length;j++){
                    if(kn[i][j]==1){
                        ans+="{"+i+"-"+j+"} ";
                    }
                }
            }
            set.add(ans);
            return;
        }
        else{
            for(int i=0;i<kn.length;i++){
                for(int j=0;j<kn.length;j++){
                    if(kn[i][j]==0 && issafe(kn,i,j)){
                        kn[i][j]=1;
                        n_k(kn,k-1);
                        kn[i][j]=0;
                    }
                }
            }
        }
    }
    public static boolean issafe(int[][] kn,int i,int j){
        int num=kn.length;
        int x[]={1,2,-1,-2,-2,-1,1,2};
        int y[]={2,1,2,1,-1,-2,-2,-1};
        for(int m=0;m<x.length;m++){
            int a=i+x[m];
            int b=j+y[m];
            if(a>=0 && a<num){
                if(b>=0 && b<num){
                    if(kn[a][b]==1){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}

