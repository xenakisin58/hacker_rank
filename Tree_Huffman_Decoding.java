/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root) {
    Node curr = root;
    for(int i=0;i<S.length(); i++){
        if(S.charAt(i)=='0'){
            if(curr.left!=null){
                curr = curr.left;
            }
        }
        else{
            if(curr.right!=null){
                curr = curr.right;
            }
        }
        if(curr.left==null && curr.right == null){
            System.out.print(curr.data);
            curr = root;
        }
    }    
}
