/*Given a set of integers, check whether the set is a jolly jumper sequence.



A sequence of n numbers (n < 3000) is called Jolly Jumper if the absolute values of the differences between the successive elements take on all possible values from 1 through n-1. The definition implies that any sequence of a single integer is a jolly jumper.



Example:

Input: 1 4 2 3

Output: True

This sequence 1 4 2 3 is Jolly Jumper because

the absolute differences are 3, 2, and 1.

Input format
First line has number of elements. Second line has the elements separated by space

Output format
Output displays Yes or No

Sample testcases
Input 1
5
1 2 3 4 5
Output 1
No
*/
import java.util.*;
class A{
    public static boolean check(int a[],int n){
        boolean d[]=new boolean[n];
        for(int i=0;i<n-1;i++){
            int di=Math.abs(a[i]-a[i+1]);
            if(di==0||di>n-1||d[di]==true)
            return false;
            d[di]=true;
        }
        return true;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        if(check(a,n)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}