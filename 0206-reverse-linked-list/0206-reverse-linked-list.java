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
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode nextNode = head.next;
        ListNode prevNode = head;
        ListNode temp = nextNode.next;
        prevNode.next = null;
        // head.next == null;
        while(nextNode != null){
            // temp = nextNode.next;
            nextNode.next = prevNode;
            prevNode = nextNode;
            nextNode = temp;
            if(temp == null)break;
            temp = temp.next;
        }
        return prevNode;
    }
}