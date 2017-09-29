     /* 
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       if(root == null){
           return;
       }
       Queue<Node> queue = new LinkedList<Node>();
       queue.add(root);
       while(!queue.isEmpty()){
           Node curr = queue.remove();
           System.out.print(curr.data+" ");
           if(curr.left!=null){
               queue.add(curr.left);
           }
           if(curr.right!=null){
               queue.add(curr.right);
           }
       }
   }
