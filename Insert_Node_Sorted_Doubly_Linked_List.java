/*
  Insert Node at the end of a sorted doubly linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data) {
    if(head==null){
        Node nn = new Node();
        nn.data = data;
        return nn;
    }
    else{
        Node n_curr = head;
        Node n_prev = head;
        Node nn = new Node();
        nn.data = data;
        while(n_curr!=null){
            if(nn.data < n_curr.data && nn.data >= n_prev.data){
                break;
            }
            else{
                n_prev = n_curr;
                n_curr = n_curr.next;
            }
        }
        nn.next = n_curr;
        nn.prev = n_prev;
        n_prev.next = nn;
        if(n_curr!=null){
            n_curr.prev = nn;
        }
        return head;
    }
}
