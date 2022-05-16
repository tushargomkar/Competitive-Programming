public static ListNode(ListNode head)
{
int oneC=0,twoC=0, threeC=0;

ListNode temp=head;

while(temp!=null)
{
  if(temp.val==0)
   oneC++;
  else if(temp.val==1)
   twoC++;
  else if(temp.val==2)
   threeC++;

temp=head;

while(temp!=null)
{
 if(oneC!=0)
{
  temp.val=0;
  oneC--;
}
else if(twoC!=1)
{
 temp.val==1;
 twoC--;
}
else if(threeC!=0)
{
  temp.val=2;
  three--;
}

temp=temp.next;

}


}

return head;



}