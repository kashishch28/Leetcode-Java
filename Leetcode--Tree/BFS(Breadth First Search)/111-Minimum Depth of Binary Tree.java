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
    public int minDepth(TreeNode root) {


        if(root==null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        return (left==0 || right==0) ? left+right+1: Math.min(left,right)+1;


    //     if(root==null) return 0;
    //     Queue<TreeNode> queue = new LinkedList<>();
    //     queue.add(root);
    //     int d =1;
    //     while(!queue.isEmpty()){
    //         int size = queue.size();
    //         for(int i=0;i<size;i++){
    //             TreeNode n = queue.poll();

    //             if(n.left==null && n.right==null){
    //                 return d;
    //             }
    //             //add l, r to q if they exist
    //             if(n.left!=null){
    //                 queue.add(n.left);
    //             }
    //             if(n.right!=null){
    //                 queue.add(n.right);
    //             }

    //         }
    //         d++;

    //     }
    //     return 0;
    }
}