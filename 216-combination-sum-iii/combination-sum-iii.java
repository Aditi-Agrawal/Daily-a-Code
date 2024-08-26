class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(0,k,n,arr,list,ans);
        return ans;
    }

    private void helper(int ind, int k,int target,int[] arr,List<Integer> list,List<List<Integer>> ans){
        if(ind==arr.length){
            if(k==0 && target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(arr[ind]<=target){
            //pick
            list.add(arr[ind]);
            helper(ind+1,k-1,target-arr[ind],arr,list,ans);
            list.remove(list.size()-1);
        }
        //not pick
        helper(ind+1,k,target,arr,list,ans);
    }
}