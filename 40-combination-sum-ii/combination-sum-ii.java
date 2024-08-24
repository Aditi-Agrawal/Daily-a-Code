class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        f(0,target,candidates,ds,ans);
        return ans;
    }

    private void f(int ind, int target ,int[] arr, List<Integer> ds, List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=ind;i<arr.length;i++){

            if(i>ind && arr[i]==arr[i-1]) continue;

            if(arr[i]>target) break;

            if(arr[i]<=target){
                ds.add(arr[i]);
                f(i+1,target-arr[i],arr,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
    }
}