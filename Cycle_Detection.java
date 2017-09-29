/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    Node tortoise = head;
    Node hare = head;
    while(tortoise!=null && tortoise.next!=null){
        tortoise = tortoise.next;
        hare= hare.next.next;
        if(tortoise == null || hare == null){
            return false;
        }
        if(tortoise == hare){
            return true;
        }
    }
    return false;
}
