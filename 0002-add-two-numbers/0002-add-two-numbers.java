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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) { 
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        int carry=0;
         while(l1!=null || l2!=null)
         {
             int x=(l1!=null)? l1.val : 0;
             int y=(l2!=null)? l2.val : 0;

             int sum=x+y+carry;
             carry=sum/10;        //if(sum>9) ex:sum=14 then new carry=14/10 = 1
             int last_dig=sum%10;  // for sum=14 then last_dig= 14%10 = 4( add this to next node)
             cur.next=new ListNode(last_dig);
             cur=cur.next;

             if(l1!=null) l1=l1.next;
             if(l2!=null) l2=l2.next;
             
         }
         if(carry>0)
         {
             cur.next= new ListNode(carry);
         }
         return dummy.next;
    }
     
}