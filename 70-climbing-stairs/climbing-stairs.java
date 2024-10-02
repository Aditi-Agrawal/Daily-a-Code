class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
    }

    private int helper(int n, int[] dp){
        if(n==0){
            return 1;
        }
        if(n==1){
            return 1;
        }

        if(dp[n]!=-1){
            return dp[n];
        }

        int step1 = helper(n-1,dp);
        int step2 = helper(n-2,dp);

        return dp[n] = step1 + step2;
    }
}
// class Solution {
//     public int climbStairs(int n) {
//         return helper(n);
//     }

//     private int helper(int n){
//         if(n==0){
//             return 1;
//         }
//         if(n==1){
//             return 1;
//         }
//         int step1 = helper(n-1);
//         int step2 = helper(n-2);

//         return step1 + step2;
//     }
// }