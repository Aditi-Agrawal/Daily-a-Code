class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(0, 0, n, "", ans);
        return ans;
    }

    public void helper(int oc, int cc, int n, String str, List<String> ans){
        if(oc==n && cc==n){
            ans.add(str);
            return;
        }
        if(oc<n)
            helper(oc+1, cc, n, str + "(", ans);
        
        if(cc<oc && cc<n)
            helper(oc, cc+1, n, str + ")", ans);
    }
}