/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method.
    Node resetB = headB;
    while(headA!=null){
        while(headB!=null){
            if(headA == headB){
                return headA.data;
            }
            headB = headB.next;
        }
        headA= headA.next;
        headB = resetB;
    }
    return -1;
}
