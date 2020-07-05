//search in rotated array
class Solution 
{ 
    static int Search(int nums[], int target)
	{
	    // code here
	    ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++)
            al.add(nums[i]);
        if(al.contains(target)){
            return al.indexOf(target);
        }
        else
            return -1;
	}
} 