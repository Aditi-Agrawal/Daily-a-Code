class Solution {
    static String[] mapping = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return new ArrayList<>();
        }
        List<String> ans = new ArrayList<>();
        helper(digits, "", ans);
        return ans;
    }

    public void helper(String digits, String s, List<String> ans){
        if(digits.length() == 0){
            ans.add(s);
            return;
        }

        char digitPressed = digits.charAt(0); //'2'
        int index = digitPressed - '0';
        for(int i=0;i<mapping[index].length();i++){
            helper(digits.substring(1),s+mapping[index].charAt(i),ans);
        }

    }
}