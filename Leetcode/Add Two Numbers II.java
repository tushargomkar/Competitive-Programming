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
    
    
    
    public static ListNode reverse(ListNode head)
    {
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextNode=null;
        
        while(curr!=null)
        {
            nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }
        return prev;

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode dummy= new ListNode();
        ListNode temp=dummy;
        int c=0;
        
        l1=reverse(l1);
        l2=reverse(l2);
        while(l1!=null || l2!=null || c==1)
        {
          int sum=0;
            
            if(l1!=null)
            {
                sum+=l1.val;
                l1=l1.next;
            }
            
            if(l2!=null)
             {
                 sum+=l2.val;
                l2=l2.next;
             }
            
            
            sum+=c;
            c=sum/10;
            ListNode node =new ListNode(sum%10);
            temp.next=node;
            temp=temp.next;
            
            
        }
        
        dummy.next=reverse(dummy.next);
        return dummy.next;
    }
}