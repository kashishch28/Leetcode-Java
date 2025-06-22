class Solution {
//Recursion
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbersHelper(l1, l2, 0);
    }
    private ListNode addTwoNumbersHelper(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int sum = carry;
        if (l1 != null) {
            sum += l1.val;
        }
        if (l2 != null) {
            sum += l2.val;
        }
        ListNode currentNode = new ListNode(sum % 10);
        currentNode.next = addTwoNumbersHelper(
            l1 != null ? l1.next : null,
            l2 != null ? l2.next : null,
            sum / 10
        );
        return currentNode;
    }

    //Linked List
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total=0;
        int carry=0;
        while(l1!=null || l2!=null || carry!=0){
            total = carry;
            if(l1!=null){
                total+=l1.val;
                l1=l1.next;

            }
            if(l2!=null){
                total+=l2.val;
                l2=l2.next;

            }
            int num=total%10;
            carry = total/10;
            dummy.next = new ListNode(num);
            dummy = dummy.next;
            
        }

        return res.next;        
    }



}
