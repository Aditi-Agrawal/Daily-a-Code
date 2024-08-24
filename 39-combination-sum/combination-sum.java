class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(0, target,candidates, new ArrayList<>(),ans);
        return ans;
    }

    private void helper(int ind, int target, int[] arr, List<Integer> list, List<List<Integer>> ans ){
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<=target){
            //pick
            list.add(arr[ind]);
            helper(ind,target-arr[ind],arr,list,ans);
            list.remove(list.size()-1);
            //not pick
        }
        helper(ind+1,target,arr,list,ans);
    }
}