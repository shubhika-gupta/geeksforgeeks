//Rotate array
class Solution
{
    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:arr){
            al.add(i);
        }
        for(int i:arr){
            al.add(i);
        }
        for(int i=d,j=0;i<d+n&&j<n;i++,j++){
            arr[j]=al.get(i);
        }
    }
}