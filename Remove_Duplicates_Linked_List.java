/*
Delete duplicate-value nodes from a sorted linked list

Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
    // This is a "method-only" submission. 
    // You only need to complete this method.
    Node curr = head;
    Node prev = head;
    ArrayList list = new ArrayList();
    while(curr!=null){
        if(!list.contains(curr.data)){
            list.add(curr.data);
            prev = curr;
            curr = curr.next;
        }
        else{
            prev.next = curr.next;
            curr = curr.next;
        }
    }
    return head;
}
