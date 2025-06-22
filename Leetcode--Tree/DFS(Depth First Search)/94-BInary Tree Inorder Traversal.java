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

 //recursive

class Solution {
    // public List<Integer> inorderTraversal(TreeNode root) {
    //     List<Integer>res = new  ArrayList<>();
    //     inorder(root,res);
    //     return res;
    // }
    // public void inorder(TreeNode node,List<Integer>res){
    //     if(node==null){
    //         return;
    //     }
    //     inorder(node.left,res);
    //     res.add(node.val);
    //     inorder(node.right,res);
    // }

//stack
public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> li = new ArrayList<>();
    if(root==null)return li;
    Stack<TreeNode> st = new Stack<>();
    TreeNode curr = root;
    while(curr!=null || !st.isEmpty()){
        while(curr!=null){
            st.push(curr);
            
            curr = curr.left;
        }
        curr = st.pop();
        li.add(curr.val);
        curr = curr.right;
    }
    return li;


    }
}









