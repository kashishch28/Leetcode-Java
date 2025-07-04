/**
 * Definition for singly-linked list.
 public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//By Recursion

    if(l1==null)return l2;
    if(l2==null)return l1;
    if(l1.val<l2.val){
        l1.next = mergeTwoLists(l1.next,l2);
        return l1;
    }
    else{
    l2.next = mergeTwoLists(l1,l2.next);
    return l2;
    }



        //By Linked List

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                curr.next = list1;
                list1 = list1.next;
            }
            else{
                curr.next = list2; 
                list2 = list2.next;  
            }  
            curr = curr.next;  
        }  
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        return dummy.next;
    }
}
