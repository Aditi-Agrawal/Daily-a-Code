class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        func(0,s,list,ans);
        return ans;
    }

    private void func(int index, String s, List<String> list, List<List<String>> ans){
        if(index == s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }

        for(int i = index; i<s.length();i++){
            if(isPalindrome(s,index,i)){
                list.add(s.substring(index,i+1));
                func(i+1, s,list,ans);
                list.remove(list.size()-1);
            }
        }
        return;
    }

    private boolean isPalindrome(String s, int start, int end){
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

}