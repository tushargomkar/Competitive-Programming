

public static ListNode  middleOfLL(ListNode head){

if(head==null || head.next==null) return head;

ListNode slow=head;
ListNode fast=head;


 while(fast.next!=null && fast.next.next!=null)
{
  slow=slow.next;
  fast=fas.next;
}
 return slow;

}


public static ListNode  reverseOfLL(ListNode head){

if(head==null || head.next==null) return head;

 ListNode prev =null;
 ListNode curr=head;
 ListNode nextNode=null;



while(curr!=null);
{

nextNode=curr.next;
curr.next=prev;
prev=curr;
curr=nextNode;


}
return prev;


}



public static Void foldOfLL(ListNode head){

if(head==null || head.next==null) return head;


ListNode mid=middleOfLL(head);
ListNode nHead=mid.next;

mid.next=null;

nHead=reverseOfLL(nHead);

ListNode c1=head;
ListNode c2=head;
ListNode f1=null;
ListNode f2=null;

while(c2!=null)
{
f1=c1.next;
f2=c2.next;

c1.next=c2;
c2.next=f1;

c1=f1;
c2=f2;




}
return head;

}












