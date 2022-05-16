public static ListNode 012sortingLL(ListNode head)
{
ListNode zeroHead = new ListNode(-1);
ListNode zeroTail=zeroHead;

ListNode oneHead = new ListNode(-1);
ListNode oneTail=oneHead;

ListNode twoHead = new ListNode(-1);
ListNode twoTail=twoHead;

ListNode curr=head;

while(curr!=null)
{
 if(curr.val==0)
  insertAtTail(zeroTail, curr);

 else if(curr.val==1)
  insertAtTail(oneTail,curr);

 else if(curr.val==2)
  insertAtTail(twoTail,curr);

  curr=curr.next;
}


//merge the sorted list into one lisst;

if(oneHead.next!=null)
{
 zeroTail.next=oneHead.next;
}
else{
  zeroTail.next=twoHead.next;
}

oneTail.next=twoHead.next;
twoTail.next=null;


 return head =zeroHead.next;

}

public static ListNode insertAtTail(ListNode tail, ListNode curr)
{

  tail.next=curr;
  tail=curr;
}