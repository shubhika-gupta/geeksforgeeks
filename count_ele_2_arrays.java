//counting element in 2 arrays
class GfG
{
    static int bin(int arr2[],int start,int end,int x){
        while(start<=end){
            int mid=(start+end)/2;
            if(arr2[mid]<=x)
            start=mid+1;
            else
            end=mid-1;
        }
        return end;
    }
    public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
    {
       // add your code here
       ArrayList<Integer> list=new ArrayList<>();
       Arrays.sort(arr2);
       for(int i=0;i<m;i++){
           int index=bin(arr2,0,n-1,arr1[i]);
           list.add(index+1);
       }
       return list;
    }
}