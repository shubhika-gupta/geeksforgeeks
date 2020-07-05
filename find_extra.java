//find extra element
class GfG {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int index=b.length;
        int start=0,end=b.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==b[mid]){
                start=mid+1;
            }
            else{
                index=mid;
                end=mid-1;
            }
        }
        return index;
    }
}