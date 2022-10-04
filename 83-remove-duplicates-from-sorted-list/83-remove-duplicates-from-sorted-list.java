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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        if(head.next == null) {
            return head;
        }
        ListNode current = head.next;
        ListNode prev = head;
        while(current != null) {
            if(prev.val == current.val) {
                if(current.next != null) {
                    prev.next = current.next;
                    current =  current.next;
                } else {
                    prev.next = null;
                    break;
                }
            } else {
                prev=current;
                current = current.next;
            }
        }
        return head;
    }
}