 /* Iterative solution as problem specifies to return root of updated
 tree and doesn't pass root as its own argument
 
 Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
    if(root == null){
        Node nn = new Node();
        nn.data = value;
        return nn;
    }
    else{
        Node curr = root;
        while(curr!=null){
            if(value < curr.data){
                if(curr.left!=null){
                    curr = curr.left;
                    continue;
                }
                else{
                    Node nn = new Node();
                    nn.data = value;
                    curr.left = nn;
                    break;
                }
            }
            else{
                if(curr.right!=null){
                    curr = curr.right;
                    continue;
                }
                else{
                    Node nn = new Node();
                    nn.data = value;
                    curr.right = nn;
                    break;
                }
            }
        }
    }
    return root;
}
