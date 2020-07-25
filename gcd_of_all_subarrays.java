//gcd of all subarrays
import java.util.*;
class A{
    public static int total(int[] a,int n){
        int sum=0;
        int temp=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                temp=0;
                for(int k=i;k<=j;k++){
                    temp=gcd(temp,a[k]);
                }
                sum+=temp;
            }
        }
        return sum;
    }
    public static int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(sc.nextLine());
        System.out.print(total(a,n));
    }
}