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
    public ListNode swapPairs(ListNode head) {
        ListNode cur=head;
        ListNode prev=null;
        ListNode nextNode=null;
        
        int count=0;
        
        while(cur!=null && count<2)
        {
            nextNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextNode;
            count++;  
        }
        if(nextNode!=null)
        {
            head.next=swapPairs(nextNode);
        }
        return prev;
    }
}