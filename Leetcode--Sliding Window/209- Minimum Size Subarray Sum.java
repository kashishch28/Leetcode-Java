class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int start=0;
        int end=0;
        int sum=0;
        int res = Integer.MAX_VALUE;
        for(end=0;end<nums.length;end++){
            sum+=nums[end];
            while(sum>=target){
                res = Math.min(res,end-start+1);
                sum -=nums[start];  
                //after updation remove first element by reduceing sum by start and increasing start
                start++;
            }
        }
        // if(res==Integer.MAX_VALUE)return 0;
        // return res;
        return res==Integer.MAX_VALUE? 0:res;
    }
}
