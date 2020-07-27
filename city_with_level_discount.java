/*

You have received n coupons which give discounts for the exam. Each coupon can be applied for a particular city, for a given level and will provide a certain discount.



You want to attempt all the three levels of the exam, and you are willing to go to different cities to avail the maximum discount. So, for each level, find out the maximum discount that you can avail, and which city you'd need to go to to do so. If there are multiple such cities, choose the city that has the least number. That is, if the discounts are same, city i is preferable over city j, if i < j.

Input format
The first line of each test case contains a single integer n denoting the number of coupons. Each of the next n lines contains three space-separated integers city c, level l and discount x applicable in the i-th coupon.

Output format
For each test case, output three lines. The first line should contain two space-separated integers: maximum discount for level 1, and the city where you can avail this discount. In case of ties, find the smallest numbered such city. Similarly, second and third line should contain similar info for second and third levels.



Note : There is a new line at the end of output

Code constraints
1 ≤ T ≤ 100

3 ≤ n ≤ 100

1 ≤ c ≤ 100

1 ≤ l ≤ 3

1 ≤ x ≤ 100

It is guaranteed that for each level, there will at least one coupon.

Sample testcases
Input 1
7
2 1 10
1 1 20
3 2 100
2 3 50
2 2 100
5 3 75
100 3 75
Output 1
20 1
100 2
75 5
*/
import java.util.*;
import java.lang.*;
import java.io.*;
class A{
    static class city{
        int c,d;
        city(int c,int d){
            this.c=c;
            this.d=d;
        }
    }
    public static void main(String[]args){
        int l,d,num;
        Scanner sc=new Scanner(System.in);
            city c1=new city(999999,0);
            city c2=new city(999999,0);
            city c3=new city(999999,0);
            String s[];
            int n=Integer.parseInt(sc.nextLine());
            for(int j=0;j<n;j++){
                s=sc.nextLine().split(" ");
                num=Integer.parseInt(s[0]);
                l=Integer.parseInt(s[1]);
                d=Integer.parseInt(s[2]);
                if(l==1){
                    if(c1.d<d||(c1.d==d&&c1.c>num)){
                        c1.d=d;
                        c1.c=num;
                    }
                }
                if(l==2){
                    if(c2.d<d||(c2.d==d&&c2.c>num)){
                        c2.d=d;
                        c2.c=num;
                    }
                }
                if(l==3){
                    if(c3.d<d||(c3.d==d&&c3.c>num)){
                        c3.d=d;
                        c3.c=num;
                    }
                }
            }
            System.out.println(c1.d+" "+c1.c+"\n"+c2.d+" "+c2.c+"\n"+c3.d+" "+c3.c);
    }
}