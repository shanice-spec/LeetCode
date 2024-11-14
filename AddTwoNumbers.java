
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode cur = dummyHead;

        int carry=0;

        while (l1 != null || l2 != null || carry != 0){
            int l1_val= (l1 != null)? l1.val : 0;
            int l2_val= (l2 !=null)? l2.val :0 ;

            int sum = l1_val + l2_val + carry;
            carry = sum/10;
            int last_digit = sum % 10;
            ListNode newlist = new ListNode(last_digit);

            cur.next =newlist;
            if (l1 != null) l1= l1.next;
            if (l2 != null) l2 = l2.next;
            cur = cur.next;

        }

        return dummyHead.next;
    }
}
