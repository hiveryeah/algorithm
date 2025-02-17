class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();

		int size = nums.length;
		for (int i = 0; i < (1 << size); i++) {
			List<Integer> ax = new ArrayList<>();
			for (int j = 0; j < size; j++) {
				if ((i & (1 << j)) != 0) {
					ax.add(nums[j]);
				}
			}
			list.add(ax);
		}
        
        return list;    
    }
}