class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, target, candidates, list, ans);
        return ans;
    }

    public void helper(int ind, int target, int[] candidates, List<Integer> list, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(ind<candidates.length){
        //pick
        if(target>=candidates[ind]){
            list.add(candidates[ind]);
            helper(ind,target-candidates[ind], candidates, list, ans);
            list.remove(list.size()-1);
        }
        ///not pick
        helper(ind+1, target, candidates, list, ans);
        }
    }
}