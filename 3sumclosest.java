//3 sum closest
class Solution 
{ 
    static int threeSumClosest(int[] num, int target)  
	{ 
        Arrays.sort(num);
       int result = num[0] + num[1] + num[num.length - 1];
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {
                    end--;
                } else {
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {
                    result = sum;
                }
            }
        }
        return result;
	} 
} 
