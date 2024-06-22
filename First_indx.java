import java.util.*;
public class First_indx {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        System.out.println(find(arr,target,0));
    }
    private static int find(int[] arr,int target,int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        return find(arr,target,idx+1);
    }
}
