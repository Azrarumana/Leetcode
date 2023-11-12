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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)return ;

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null) //divide the list into half
        {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode secHalf=reverse(slow.next); //reverse the second half
        slow.next=null;

        ListNode firstHalf=head;
        while(firstHalf!=null && secHalf!=null)
        {
            ListNode m=firstHalf.next;
            ListNode n=secHalf.next;

            firstHalf.next=secHalf;
            secHalf.next=m;
            
            firstHalf=m;
            secHalf=n;
        }
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode cur=head;

        while(cur!=null)
        {
            ListNode nextNode=cur.next;
            cur.next=prev;
            prev=cur;
            cur=nextNode;
        
        }
        return prev;
    }
}