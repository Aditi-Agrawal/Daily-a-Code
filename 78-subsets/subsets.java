class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,nums, list, ans);
        return ans;
    }
    public void helper(int ind, int[] nums,List<Integer> list, List<List<Integer>> ans){
        if(ind==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        //pick
        list.add(nums[ind]);
        helper(ind+1,nums,list,ans);
        list.remove(list.size()-1);
        //not pick
        helper(ind+1,nums,list,ans);
    }
}