/*
Collisions of Events

Lucarnos Film Festival is an annual film festival and is also known for being a prestigious platform for art house films. This year at the Lucarnos Film festival there are many movies to be screened, each of different genre ranging from drama movies to comedy ones and teen movies to horror ones. The festival is a long-running event this time as the organizers are planning to screen only one movie per day. The organizers have populated their schedule in the form of a matrix where 'i' is the movie number and 'j' is the day number. Eij is the movie preference dates.

You are given a matrix E of N rows and M columns where Eij is 1 if the i-th movie is to be screened on j-th day, otherwise it will be 0. Note that it is not necessary that if a movie x will be screened on day y, then day y should screen only movie x.

You know that if there are two different movies x and y, which are to be screened on the same day z, and then there will be a collision. Can you calculate the number of different collisions at this movie festival? Note that order of movies in the collision doesn't matter.

Input format
The first line of the input contains two space separated integers N, M denoting the number of movies and days, respectively.

Each of the following N lines contain M characters, each of them is either '0' or '1'.

Output format
Output a single line containing an integer corresponding to the number of collisions at the film festival.

Refer sample input and output for formatting specifications
*/
import java.util.*;
class A{
    public static int check(int n,int r){
        return (int)(fact(n)/(fact(r)*fact(n-r)));
    }
    public static int fact(int n){
        int i,f=1;
        for(i=1;i<=n;i++)
        f*=i;
        return f;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int count=0;
        int max=0;
        for(int j=0;j<m;j++){
            int i=0;
            count=0;
            while(i<n){
            if(a[i][j]==1){
                count++;
            }
            i++;}
            if(count>=2){
                max+=check(count,2);
            }
            else{
                max+=0;
            }
        }
        System.out.println(max);
    }
}