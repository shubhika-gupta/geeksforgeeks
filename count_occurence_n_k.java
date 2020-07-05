//occurrences more than n/k
class CountElement {

    // Function to find element with count more than n/k times
    // arr: input array
    public int countOccurence(int[] arr, int n, int k) {
        // your code here,return the answer
        int count[]=new int[1000000];
        Arrays.fill(count,0);
        for(int i:arr)
        count[i]++;
        int m=0;
        for(int i=1;i<1000000;i++)
        if(count[i]>(n/k)){
            m++;
        }
        return m;
    }
}