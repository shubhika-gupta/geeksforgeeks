//find missing positive number
class FindMissing{
    
    // Function to find 
    static int findMissing(int nums[], int size)
    {
        for (int i=0; i<nums.length; i++) {
            if (nums[i] > 0 && nums[i] != i+1) {
                if (nums[i] < nums.length +1 && nums[nums[i]-1] !=nums[i]) {
                    int tmp = nums[nums[i]-1];
                    nums[nums[i]-1] = nums[i];
                    nums[i] = tmp;
                    i--;
                }
            }
        }
        for (int i=0; i<nums.length; i++) {
            if (nums[i] != i+1) return i+1;
        }
        return nums.length+1;
    }
}