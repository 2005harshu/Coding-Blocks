import java.util.*;
public class All_indices {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        findall(arr,target,0);
        
    }
    private static void findall(int[] arr,int target,int idx){
        if(idx>=arr.length){
            return;
        }
        if(arr[idx]==target){
            System.out.println(idx+" ");
        }
        findall(arr,target,idx+1);
    }
}
