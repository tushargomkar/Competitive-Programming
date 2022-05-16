public static ListNode Unfold(ListNode head){

if(head==null && head.next==null)
{
 return head;   
}


ListNode FirstH=head;
ListNode SecondH=head.next;
ListNode FirstP=head;
ListNode SecondP=SecondH;



while(SecondP!=null && SecondP.next!=null)
{
 ListNode f=SecondP.next
  
  FirstP=f;
  SecondP=f.next;

  FirstP=FirstP.next;
  SecondP=SecondP.next;


}

FirstP.next=null;
SecondH=reverse(SecondH);

FirstP.next=SecondH;
}



public static ListNode reverse(ListNode head){

if(head==null && head.next==null)
{
 return head;   
}

ListNode prev=null;
ListNode Curr=head;
ListNode nextNode=null;



while(curr!=null)
{
  nextNode=curr.next;
  curr.next=prev;
  prev=curr;
  curr=nextNode.

}
return prev;

}