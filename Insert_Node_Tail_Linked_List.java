/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    if(head == null){
        head.data = data;
        return head;
    }
    else{
        Node top = head;
        while(head.next!=null){
            head = head.next;
        }
        Node nn = new Node();
        nn.data = data;
        head.next = nn;
        return top;
    }
}
