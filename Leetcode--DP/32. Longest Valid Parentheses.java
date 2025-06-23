class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        int l = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else{
                st.pop();
                if(st.isEmpty()){
                    st.push(i);
                }
                else{
                    l = Math.max(l,i-st.peek());//peek->accessing the top ele without removing it
                }
            }
        }
    return l;





        // int left = 0, right = 0, max = 0;
        // int n = s.length();
        
        // for (int i = 0; i < n; i++) {
        //     if (s.charAt(i) == '(') left++;
        //     else right++;
            
        //     if (left == right) {
        //         max = Math.max(max, left * 2);
        //     } else if (right > left) {
        //         left = right = 0;
        //     }
        // }
        
        // left = right = 0;
        // for (int i = n - 1; i >= 0; i--) {
        //     if (s.charAt(i) == '(') left++;
        //     else right++;
            
        //     if (left == right) {
        //         max = Math.max(max, left * 2);
        //     } else if (left > right) {
        //         left = right = 0;
        //     }
        // }
        
        // return max;




    }
}
