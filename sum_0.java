//triplets with sum =0
class Triplet
{
    // Function to check if triplet is present 
    // arr[]: input array
    // n: size of the array
	public boolean findTriplets(int num[] , int n)
    {
        //add code here.
        Arrays.sort(num);
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    return true;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }
        }
    }
        return false;
    }
}