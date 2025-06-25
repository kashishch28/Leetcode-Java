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
        
        // if(head==null || head.next==null){
        //     return head;
        // }
        
        // ListNode curr = head.next;
        // head.next = swapPairs(head.next.next);
        // curr.next = head;
        // return curr;



      //By two Pointers
        if(head==null || head.next==null){
            return head;
        }
        ListNode pre = null;
        ListNode curr = head.next;
        while(head!=null && head.next!=null){
            ListNode first = head;
            ListNode sec = head.next;
            //swap
            first.next = sec.next;
            sec.next = first;

            if(pre == null){
                head = sec;
            }
            else{
                pre.next = sec;
            }
            pre = first;
            head = first.next;
        }
        return curr;


    }
}
