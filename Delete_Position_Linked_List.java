/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
    // Complete this method
    if(position == 0){
        if(head.next == null){
            return null;
        }
        else{
            return head.next;
        }
    }
    else{
        Node top = head;
        Node prev = head;
        while(position > 0){
            prev = head;
            head = head.next;
            position--;
        }
        prev.next = head.next;
        return top;
    }
}
