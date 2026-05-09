class Solution {
	void nextPermutation(int[] nums) {
		// code here
		int idx = -1;
		
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				idx = i;
				break;
			}
		}
		
		if (idx == -1) {
			Arrays.sort(nums);
			return;
		}
		
		int idx2 = -1;
		for (int i = nums.length - 1; i > idx; i--) {
			if (nums[i] > nums[idx]) {
				idx2 = i;
				break;
			}
		}
		
		swap(nums, idx, idx2);
		
		Arrays.sort(nums, idx + 1, nums.length);
	}
	
	public void swap(int[] nums, int idx, int idx2) {
		int tmp = nums[idx];
		nums[idx] = nums[idx2];
		nums[idx2] = tmp;
	}
}
