class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int count[] = new int[n+1];
        int mis = -1;
        int dup = -1;

        for(int num:nums){
            count[num]++;
            if(count[num]==2){
                dup=num;
            }
        }
        //find missing
        for(int i=1;i<=n;i++){
            if(count[i]==0){
                mis = i;
                break;
            }
        }
        return new int[]{dup,mis};
    }
}
