   /*
    class Node 
       int data;
       Node left;
       Node right;
   */
   void topView(Node root) {
       if(root == null){
           return;
       }
       Node temp = root;
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(Integer.valueOf(temp.data));
       while(temp.left!=null){
           temp = temp.left;
           list.add(0,Integer.valueOf(temp.data));
       }
       while(root.right!=null){
           root= root.right;
           list.add(Integer.valueOf(root.data));
       }
       for (int i=0;i<list.size();i++){
           System.out.print(list.get(i)+" ");
       }
   }
