class Solution {
    public int longestSubarray(int[] nums) {
        int max=0;
        for(int i:nums){
            if(i>max){
                max=i;
            }
        }
        int maxLen = 1;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == max){
                count++;
                System.out.println(nums[i] + " "+ count);
            }else{
                maxLen = count>maxLen ? count : maxLen;
                count=0;
            }
        }
        maxLen = count>maxLen ? count : maxLen;
        return maxLen;
    }
}