/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        TreeNode curr = root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode temp = curr.left;
                while(temp.right!=null){
                    temp = temp.right;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    
    }
}






 //Queue approach

class Solution {
    public void flatten(TreeNode root) {
        if(root==null) return;
        Queue<TreeNode>q = new LinkedList<>();
        preOrder(root,q);
        TreeNode pre = q.poll();
        while(!q.isEmpty()){
            pre.left = null;
            TreeNode next = q.poll();
            pre.right = next;
            pre = next;
        }
    }

        private void preOrder(TreeNode root,Queue<TreeNode>q){
            if(root==null) return;

            q.add(root);
            preOrder(root.left,q);
            preOrder(root.right,q);

        }

}






//Stack Approach


class Solution {
    
    public void flatten(TreeNode root) {

        if(root==null) return;
        Stack<TreeNode>st = new Stack<>();
        preOrder(st,root);
        TreeNode curr = st.pop();
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            node.left = null;
            node.right = curr;
            curr = node;
        }
        
    }
        private void preOrder(Stack<TreeNode> st,TreeNode root){
            if(root==null) return;

            st.push(root);
            preOrder(st,root.left);
            preOrder(st,root.right);

        }

    }




//recursive

class Solution {
    private TreeNode prev = null;
    public void flatten(TreeNode root) {
        if(root==null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
       prev = root;
}

    
// }
