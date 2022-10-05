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
        if(head == null) return head;
        
        ListNode prev = new ListNode(0, head);
        ListNode node = prev; 
        while(head != null){
            if( head.next != null && head.val == head.next.val){
                while( head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                node.next = head.next;
            }else{
                // prev = node;
                node = node.next;
            }
            head = head.next;
        }
        return prev.next;
    }
}