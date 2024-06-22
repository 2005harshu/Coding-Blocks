import java.util.*;
public class Replace_0_to_5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        //int num=sc.nextInt();
        //System.out.println(print(num));
        System.out.println(num.replace('0','5'));
    }

}
// private static int print(int num){
//     int temp=0;
//     if(num==0){
//         return 5;
//     }
//     while(num>0){
//         int r=num%10;
//         if(r==0){
//             r=5;
//         }
//         temp=temp*10+r;
//         num=num/10;
//     }
//     return rev(temp);
// }
// private static int rev(int temp){
//     int ans=0;
//     while(temp>0){
//         int r=temp%10;
//         ans=ans*10+r;
//         temp=temp/10;
//     }
//     return ans;
// }
// }