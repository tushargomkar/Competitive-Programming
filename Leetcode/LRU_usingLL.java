class Node{

Node prev ,next;
int key ,value;

Node(int k, int val)
{
key=k;
val=value;

}
}

class LRUCache{






class LRUCache {

    
    ListNode head=new ListNode(0,0);
    ListNode tail=new ListNode(0,0);
     Map <Integer ,ListNode> map =new HashMap();    
    int cap;
    public LRUCache(int capacity) {
        cap=capacity;
        head.next=tail;
        tail.prev=head;
    }
    
    public int get(int key) {
     if(map.containsKey(key))
     {
         ListNode node=map.get(key);
         remove(node);
         insert(node);
         return node.value;
     }else{
         return -1;
     }
        
    }
    
    public void put(int key, int value) {
        
      if(map.containsKey(key))
      {
          remove(map.get(key));
      }
        if(map.size()==cap)
        {
         remove(tail.prev);
        }
        
    insert(new ListNode(key ,value));
        
    }
    
    private void remove(ListNode node)
{
    map.remove(node.key);
    node.prev.next=node.next;
    node.next.prev=node.prev;
    
}

private void insert(ListNode node)
{
  map.put(node.key ,node);
   ListNode nextNode=head.next;
    head.next=node;
    node.prev=head;
    nextNode.prev=node;
    node.next=nextNode;
}
    
    class ListNode{
    
    ListNode prev ,next;
    int key,value;
    
    ListNode(int k, int val)
    {
        key=k;
        value=val;
    }    
   }
}





/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */}


