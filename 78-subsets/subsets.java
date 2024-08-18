class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        helper(0,nums,list,ans);
        return ans;
    }
    private void helper(int ind,int[] arr, List<Integer> list, List<List<Integer>> ans){
        if(ind>=arr.length){
            ans.add(new ArrayList<>(list));
            return;
        }

        list.add(arr[ind]);
        helper(ind+1,arr,list,ans);
        list.remove(list.size()-1);
        helper(ind+1,arr,list,ans);
        return;
    }
}