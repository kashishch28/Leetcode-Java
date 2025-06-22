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
    public ListNode swapPairs(ListNode head) {

        //recursion
        
        if(head==null || head.next==null){
            return head;
        }
        
        ListNode curr = head.next;
        head.next = swapPairs(head.next.next);
        curr.next = head;
        return curr;
    }}

