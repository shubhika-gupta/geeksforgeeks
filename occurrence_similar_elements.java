/*
Niranjan has a set of numbers stored in an array in which he has to find the identical numbers and its positions along with the number of occurrences. Write a program to find the same.

Input format
The first line of the input consists of a single value n.

The next n lines consists of the elements of the array.

Output format
The first line of the output consists of the duplicate element.

The second line of the output consists of its index values.

The third line of the input contains number of occurrences.
*/
import java.util.*;
class A{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=sc.nextInt();
        LinkedHashMap<Integer,List<Integer>> map=new LinkedHashMap<>();
        for(int i=0;i<n;i++){
            List<Integer> al=new ArrayList<>();
            int temp=a[i];
            for(int j=0;j<n;j++){
                if(temp==a[j]){
                    al.add(j+1);
                }
            }
            map.put(temp,al);
        }
        for(java.util.Map.Entry<Integer,List<Integer>> entry: map.entrySet()){
            List<Integer> k=entry.getValue();
            if(k.size()>1){
                System.out.println("Similar element : "+entry.getKey());
                System.out.print("Positions : ");
                for(int i:k){
                    System.out.print(i+" ");
                }
                System.out.println();
                System.out.println("Occurence : "+k.size());
            }
        }
    }
}