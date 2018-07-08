class Solution {
    public int lengthOfLIS(int[] nums) {
		if(nums.length <= 1) 
			return nums.length;

		int T[] = new int[nums.length];

		for(int i=0; i < nums.length; i++)
			T[i] = 1;


		for(int i=1; i < nums.length; i++)
		{
			for(int j=0; j < i; j++)
			{
				if(nums[j] < nums[i])
				{

					if(T[j] + 1 > T[i])
					{
						T[i] = T[j] + 1;
					}
				}
			}
		}

		int longest = 0;
		for(int i=0; i < T.length; i++)
			longest = Math.max(longest, T[i]);

		return longest;
    }
}https://leetcode.com/problems/longest-increasing-subsequence/description/
