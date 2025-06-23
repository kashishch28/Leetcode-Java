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
    public ListNode rotateRight(ListNode head, int k) {
        if(head== null || head.next==null || k==0){
            return head;
        }
        ListNode curr = head;
        int n =1;
        while(curr.next!=null){
            curr = curr.next;
            n++;
        }
        k = k%n;
        if(k==0){
            return head;
        }
        curr=head;
        for(int i=1;i<n-k;i++){
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        ListNode tail = newHead;
        while(tail.next!=null){
            tail=tail.next;
        }
        tail.next = head;
        return newHead;
    }
}
