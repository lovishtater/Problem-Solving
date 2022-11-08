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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode head = Math.min(list1.val, list2.val);
        ListNode dummy = new ListNode(-1);
        ListNode head = dummy;
        
        ListNode l1 = list1;
        ListNode l2 = list2;
        
        if (l1 == null && l2 == null) return l1;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                head.next = l1;
                l1 = l1.next;
            }else{
                // System.out.println(head.val);
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        head.next = l1 != null ? l1 : l2;
        
        return dummy.next;
    }
}