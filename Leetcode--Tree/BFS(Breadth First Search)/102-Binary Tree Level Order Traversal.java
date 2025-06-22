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

//Queue Approach
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
        int size = q.size();
        List<Integer> currLi = new ArrayList<>(size);
        for(int i=0;i<size;i++){
            TreeNode curr = q.poll();
            currLi.add(curr.val);
            if(curr.left!=null) q.offer(curr.left);
            if(curr.right!=null) q.offer(curr.right);

        }
        
        res.add(currLi);
        }
        return res;
    }

//Recursive Approach

public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        levelOrderT(root, 0, res);
        return res;
    }

    private void levelOrderT(TreeNode node, int level, List<List<Integer>> res) {
        if (node == null) {
            return;
        }

        if (level == res.size()) {
            res.add(new ArrayList<>());
        }

        res.get(level).add(node.val);
        levelOrderT(node.left, level + 1, res);
        levelOrderT(node.right, level + 1, res);
    }
}
