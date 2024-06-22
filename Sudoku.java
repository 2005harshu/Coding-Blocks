import java.util.*;
public class Sudoku {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] grid =new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        solve(grid,0,0,n);  
    }
    public static void solve(int[][] grid,int row,int col,int n){
        if(col==n){
            col=0;
            row=row+1;
        }
        if(row==n){
            display(grid);
            return;
        }
        if(grid[row][col]!=0){
            solve(grid,row,col+1,n);
        }
        else{
            for(int i=1;i<=n;i++){
                if(issafe(grid,row,col,i)){
                    grid[row][col]=i;
                    solve(grid,row,col+1,n);
                    grid[row][col]=0;
                }
            }
        }
    }
    public static boolean issafe(int[][] grid,int row,int col,int val){
        int r=row;
        int c=col;

        for(int i=0;i<grid.length;i++){
            if(grid[i][c]==val){
                return false;
            }
        }

        for(int i=0;i<grid.length;i++){
            if(grid[r][i]==val){
                return false;
            }
        }
        r=row-row%3;
        c=col-col%3;

        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(grid[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }
    public static void display(int[][] grid){
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
