class Solution {
    public int findDuplicate(int[] nums) {

      //By HashSet
        HashSet<Integer>map = new HashSet<>();
        for(int num:nums){
            if(map.contains(num)){
                return num;
            }
            else{
                map.add(num);
            }
        }
        return -1;
    }
}
