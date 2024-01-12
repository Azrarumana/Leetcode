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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode preLeft = dummy;
        ListNode cur=head;
        
        for(int i=0;i<left-1;i++)
        {
            preLeft=preLeft.next;
            cur=cur.next;
        }
        ListNode subListHead=cur;
        
        ListNode prev=null;
        for(int i=0;i<=right-left;i++)
        {
            ListNode nextNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextNode;
            
        }
        
        preLeft.next=prev;
        subListHead.next=cur;
        
        return dummy.next;
        
    }
}