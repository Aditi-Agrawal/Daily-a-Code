class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans =new ArrayList<>();
        helper(0,n,ans);
        return ans;
    }

    private void helper(int initial, int end, List<Integer> ans){
        if(initial > end) {
			return;
		}
		if(initial!=0){
            ans.add(initial);
        }		
		int callNumber = 0;
		
		if(initial == 0) {
			callNumber = 1;
		}
		
		while(callNumber <= 9) {
			helper(initial * 10 + callNumber, end,ans);
			callNumber++;
		}
    }
}