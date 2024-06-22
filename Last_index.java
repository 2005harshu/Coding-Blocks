import java.util.*;
public class Last_index {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        find(arr,target,arr.length-1);
    }
    private static void find(int[] arr,int target,int l ){
        if(l<0){
            System.out.println("-1");
            return;
        }
        if(arr[l]==target){
            System.out.println(l);
            return;
        }
        find(arr,target,l-1);
    }
}
