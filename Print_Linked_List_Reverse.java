/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    if(head!=null){
        StringBuilder sb = new StringBuilder();
        while(head!=null){
            sb.insert(0,Integer.toString(head.data)+"\n");
            head = head.next;
        }
        System.out.print(sb);
    }
}

/*Alternatively you can add elements in sequential order and print SB in reverse */
