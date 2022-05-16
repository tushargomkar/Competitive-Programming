

public static sortTheLL(ListNode head)
{

if(head==null && head.next==null)
{return head;}



ListNode p1=null;
ListNode p2=null;
ListNode f=head;

while(p1==null && p2==null)
{
 if(f.val==1)
{
 p2=f;
}

if(f.val==0)
{
p1=f;
}
f=f.next;
}

ListNode P1F=p1.next;
ListNode P2F=p2.next;
while(P1F!=null && P2F!=null)
{
if(P1F.val==0)
{
p1.next=P1F;
P1F=P1F.next;
}
if(f.val==0)
{
 p2.next=P2F;
P2f=P2F.next;
}

return head;




}

}