class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper(0,0,"",n,ans);
        return ans;
    }

    public void helper(int oc, int cc,String str, int n, List<String> ans){
        if(oc==n && cc==n){
            ans.add(str);
            return;
        }

        if(oc<n){
            helper(oc+1, cc, str+"(", n, ans);
        }
        if(cc<oc && cc<n){
            helper(oc, cc+1, str+")", n, ans);
        }
        return;
    }
}