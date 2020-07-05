//triplets to give particular given sum
class TripletSum
{
    // arr[] : The input Array
    // N : Size of the Array
    // X : Sum which you need to search for 
    
    public static int find3Numbers(int num[], int N, int X) { 
    
       // Your code Here
       Arrays.sort(num);
    for (int i = 0; i < num.length-2; i++) {
        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
            int lo = i+1, hi = num.length-1, sum = X - num[i];
            while (lo < hi) {
                if (num[lo] + num[hi] == sum) {
                    return 1;
                } else if (num[lo] + num[hi] < sum) lo++;
                else hi--;
           }
        }
    }
        return 0;
    
    }
}