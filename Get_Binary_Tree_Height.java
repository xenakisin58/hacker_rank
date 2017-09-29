	/*
    This is just the function for get_height.
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
		if (root == null) {
            return -1;
        } else {
            return Math.max(height(root.left)+1, height(root.right)+1);
        }
}
