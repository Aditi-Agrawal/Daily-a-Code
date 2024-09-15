class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans =  new ArrayList<>();
        helper(0, nums, list, ans);
        return ans;
    }

    public void helper(int ind, int[] nums, List<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));

        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i]==nums[i-1]) continue;
            list.add(nums[i]);
            helper(i+1,nums,list,ans);
            list.remove(list.size()-1);
        }
    }
}