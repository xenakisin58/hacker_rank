/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node nn = new Node();
    nn.data = data;
    if(position == 0){
        nn.next = head;
        return nn;
    }
    else{
        Node top = head;
        for(int i=0;i<position - 1; i++){
            head = head.next;            
        }        
        nn.next = head.next;
        head.next = nn;
        return top;
    }
}
