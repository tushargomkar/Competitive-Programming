public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return null;
        }
        
         ListNode first=head;
         ListNode second=head;
        
        while(second!=null && second.next!=null)
        {
            first=first.next;
            second=second.next.next;
            
            if(first==second)
            {
                break;
            }
        }        
        if(first!=second)
        {
            return null;
        }
        
        first=head;
        
        while(first!=second)
        {
            first=first.next;
            second=second.next;          
           
     
        }
        
        
         return first;
        
    }
}