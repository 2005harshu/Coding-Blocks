import java.util.*;
public class Maze_path2 {
    static int count=0;
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        paths(arr,0,0,"");
        System.out.println();
        System.out.println(count);
    }
    private static void paths(int[][] arr,int n,int m,String s){
        if(n==arr.length-1 && m==arr[0].length-1){
            count++;
            System.out.print(s+" ");
            return;
        }
        if(n<arr.length-1){
            paths(arr,n+1,m,s+"V");
        }
        if(m<arr[0].length-1){
            paths(arr,n,m+1,s+"H");
        }
    }
}
