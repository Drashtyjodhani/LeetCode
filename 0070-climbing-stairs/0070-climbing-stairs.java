class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }
        int prev1=0,prev2=1,curr=0;
        for(int i=1;i<=n;i++){
            curr = prev1+prev2;
            prev1=prev2;
            prev2=curr;
        }
        return curr;
    }
}