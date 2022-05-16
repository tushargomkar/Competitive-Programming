public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode first=head;
        ListNode second=head;
        
        if(head==null || head.next==null)
        {
            return false;
        }
        //to check Stand at last and second last is null then it can not have cycle
        while(second.next!=null && second.next.next!=null){
            
            first=first.next;
            second=second.next.next;
            
            if(first==second)
            {
              return true;
            }
        }
              
        return false; 
    }
}