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
    public ListNode swapNodes(ListNode head, int k) {
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }
        ListNode temp = head;
        int size = 1;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        ListNode first = head;
        ListNode second = head;
        int orgk = k;
        k--;
        while(k-- > 0){
            first = first.next;
        }
        int val= size-orgk;
        while(val-- > 0){
            second = second.next;
        }
        int firstVal= first.val;
        int secondVal = second.val;
        first.val = secondVal;
        second.val= firstVal;
        return head;
    }
}