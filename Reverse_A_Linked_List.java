/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
Node Reverse(Node head) {
    if(head!=null){
        ArrayList<Node> node_list = new ArrayList<Node>();
        while(head!=null){
            node_list.add(head);
            head = head.next;
        }
        Node top = node_list.get(node_list.size()-1);
        for(int i=node_list.size()-1;i>0;i--){
            node_list.get(i).next = node_list.get(i-1);
        }
        node_list.get(0).next = null;
        return top;
    }
    else{
        return null;
    }
}
