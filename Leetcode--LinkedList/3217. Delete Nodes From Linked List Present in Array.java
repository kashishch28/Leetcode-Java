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
    public ListNode modifiedList(int[] nums, ListNode head) {
    Set<Integer> dup = new HashSet<>();
    for (int num : nums) {
        dup.add(num);
    }

    ListNode dummy = new ListNode(-1);
    ListNode current = dummy;

    while (head != null) {
        if (!dup.contains(head.val)) {
            current.next = head;
            current = current.next;
        }
        head = head.next;
    }

    current.next = null;
    return dummy.next;
}
}
