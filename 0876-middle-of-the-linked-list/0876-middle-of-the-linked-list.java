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
    public ListNode middleNode(ListNode head) {
        int count = 0;
        for(ListNode t = head; t != null; t = t.next){
            count++;
        }
        ListNode t = head;
        for(int i = 0; i < count/2; i++){
            t = t.next;
        }
        return t;
    }
}