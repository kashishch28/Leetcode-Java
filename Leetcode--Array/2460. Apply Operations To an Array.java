class Solution {
    public int[] applyOperations(int[] nums) {
        int[] ans  = new int[nums.length];
        int count=0;
        int i;
        for(i=0;i<nums.length-1;i++){
            if(nums[i]!=0){
                if(nums[i] == nums[i + 1]){
                    ans[count] = nums[i]*2;
                     i++;
                }
                else{
                    ans[count]=nums[i];
                }
                count++;
            }
        }

        if(i!=nums.length){
            ans[count] = nums[nums.length-1];
        }
        return ans;
    }
}
