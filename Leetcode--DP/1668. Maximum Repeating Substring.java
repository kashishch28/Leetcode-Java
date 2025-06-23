class Solution {
    public int maxRepeating(String sequence, String word) {
        int count=0;
        StringBuilder tar = new StringBuilder(word);
        while(sequence.contains(tar.toString())){
            count++;
            tar.append(word);
        }
        return count;


//dp
        // int n = sequence.length();
        // int m = word.length();
        // int[] dp = new int[n + 1];
        // int maxRepeat = 0;

        // for (int i = m; i <= n; i++) {
        //     if (sequence.substring(i - m, i).equals(word)) {
        //         dp[i] = dp[i - m] + 1;
        //         maxRepeat = Math.max(maxRepeat, dp[i]);
        //     }
        // }

        // return maxRepeat;
    }
}
