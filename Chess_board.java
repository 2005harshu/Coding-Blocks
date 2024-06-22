import java.util.*;
public class Chess_board {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        print(arr,0,0,"");
        System.out.println(count);

    }
    static void  print(int[][] arr,int row,int col,String s){
        //if Index out of bound condition
        if(row>=arr[0].length|| col>=arr[0].length){
            return;
        }
        s+="{"+row+"-"+col+"}";
        //base case
        if(row==arr[0].length-1 && col==arr[0].length-1){
            System.out.print(s+" ");
            count++;
            return;
        }

        //for Knight
        int[] r={2,1};
        int[] c={1,2};
        for(int i=0;i<c.length;i++){
            print(arr,row+r[i],col+c[i],s+"K");
        }
        //for rook
        if(row==0||col==0||row==arr[0].length-1||col==arr[0].length-1){
            //for row
            for(int i=1;i<arr.length;i++){
                print(arr,row+i,col,s+"R");
            }
            //for col
            for(int i=1;i<arr.length;i++){
                print(arr,row,col+i,s+"R");
            }
        }
        //for bishop
        if(row+col==arr.length-1||row==col){
            for(int i=1;i<arr.length;i++){
                print(arr,row+i,col+i,s+"B");
            }
        }

    }
}