/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
//By reversing the list

        Stack<ListNode>stack = new Stack<>();
        ListNode pre = null;
        ListNode cur = head;
        while(cur!=null){
            ListNode Next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = Next;

        }
        ListNode newH = new ListNode(pre.val);
        int max = newH.val;
        cur = pre.next;
        while(cur!=null){
            if(cur.val>=max){
                ListNode node = new ListNode(cur.val);
                node.next = newH;
                newH = node;
                max = node.val;
            }
            cur = cur.next;
        }
        return newH;




        // Stack<ListNode> stack = new Stack<>();
                                                              
        // ListNode temp = head;                                     //insert nodes into stack
        // while(temp!=null){
        //     stack.push(temp);
        //     temp = temp.next;
        // }
        // ListNode newH = stack.pop();                           //new ans list
        // int maxV = newH.val;
        // while(!stack.isEmpty()){
        //     ListNode node = stack.pop();
        //     if(node.val<maxV){
        //         continue;
        //     }
        //     else{
        //         node.next = newH;
        //         newH = node;
        //         maxV = node.val;
        //     }
        // }
        // return newH;

    }
}
