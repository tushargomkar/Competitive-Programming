public static ListNode middleOfLL(ListNode node){

ListNode slow=node;
ListNode fast=node;

if(node==null || node.next==null)
{return node;}



while(fast.next!=null && fast.next.next!=null)
{

 slow=slow.next;
 fast=fast.next.next;

}

return slow;
}



public static ListNode mergeTowSLL(ListNode l1 ,ListNode l2){



if(node==null || node.next==null)
{return node;}

ListNode c1=l1;
ListNode c2=l2;

ListNode dummy=new ListNode(-1);
ListNode prev=dummy;

while(c1!=null && c2!=null)
{

 if(c1.val<c2.val)
{
 prev.next=c1;
 c1=c1.next;
}else{
  prev.next=c2;
  c2=c2.next;
}
prev=prev.next;

}

prev.next=c1!=null ? c1: c2;

return dummy.next;
}



public static ListNode mergeSort(ListNode head)
{

if(head==null || head.next==null)
{return head;}



ListNode mid=middleOfLL(head);
ListNode nHead=mid.next;
mid.next=null;

ListNode l1 =mergeSort(head);
ListNode l2=mergeSort(nHead);
return mergeTowSLL(l1,l2);
}
