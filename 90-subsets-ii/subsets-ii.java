class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        f(0,nums,list,ans);
        return ans;
    }

    private void f(int ind, int[] nums, List<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));

        for(int i=ind;i<nums.length;i++){
            if(i>ind && nums[i] == nums[i-1]) continue;

            list.add(nums[i]);
            f(i+1,nums,list,ans);
            list.remove(list.size()-1);
        }
    }
}