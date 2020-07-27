/* 
You are given an array of integers(values are from 0 to 9), write a C program to find the minimum possible sum of two numbers formed from digits of the array. Note that all digits of given array must be used to form the two numbers.

Input format
Command line input consists of an integer denoting the array size. It is followed by space separated array elements.

Output format
For each test case output a single line containing the required sum.

Sample testcases
Input 1
6 6 8 4 5 2 3
Output 1
604
*/
import java.util.*;
class A{
    public static int check(int[] ar,int n){
        Arrays.sort(ar);
        int a=0,b=0;
        for(int i=0;i<n;i++){
            if(i%2!=0)
            a=a*10+ar[i];
            else
            b=b*10+ar[i];
        }
        return a+b;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        System.out.print(check(a,n));
    }
}