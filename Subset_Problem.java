import java.util.*;
public class Subset_Problem{
    static int a=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        print(arr,target,0,"");
        System.out.println();
        System.out.println(a);
    }
    private static void print(int[] arr,int target,int idx,String s){
        if(target==0){
            a++;
            System.out.print(s+" ");
            return;
        }
        if(idx==arr.length){
            return;
        }
        print(arr,target-arr[idx],idx+1,s+arr[idx]+" ");
        print(arr,target,idx+1,s);
    }
}