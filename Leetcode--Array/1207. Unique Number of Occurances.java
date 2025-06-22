class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        HashSet<Integer>fre = new HashSet<>();
        for(int c:freq.values()){
            if(!fre.add(c)){
                return false;
            }
            
        }
        return true; 
    }
}
