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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next==null) {
            return null;
        }
        //cal size of list
        int size = 0;
        ListNode curr = head;
        while (curr != null) {
            curr = curr.next;
            size++;
        }
        // If we need to remove the head node return the node next to head
        if (n == size) {
            return head.next; 
        }
        int i = 1; 
        ListNode prev = head;
        int search = size-n;
        while (i < search) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;        // Remove the N-th node from the end
        return head;




        
        //dummy
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        for(int i=0;i<=n;i++){
            first = first.next;
        }
        
        while(first!=null){
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;//remove the nth node

    
    return dummy.next;

        // ListNode temp = head;
        // for(int i=0;i<n;i++){
        //     temp = temp.next;
        // }
        // if(temp==null){
        //     return head.next;
        // }
        // ListNode temp2 = head;
        // ListNode pre = null;
        // while(temp!=null){
        //     temp=temp.next;
        //     pre = temp2;
        //     temp2 = temp2.next;
        // }
        // pre.next = pre.next.next;
        // return head;
    }
}
