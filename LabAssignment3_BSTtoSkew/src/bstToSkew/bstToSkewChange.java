package bstToSkew;

public class bstToSkewChange {

	static class Node
	{
		int data;
		Node left, right;

		public Node(int data)
		{			
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	static Node node;
	static Node prevNode = null;
	static Node headNode = null;

	static void flattenBTToSkewed(Node root)
	{      
		// base case; if root is null directly return
		if(root == null)
		{
			return;
		}

		flattenBTToSkewed(root.left);
		Node rightNode = root.right;

		if(headNode == null)
		{
			headNode = root;
			root.left = null;
			prevNode = root;
		}
		else
		{
			prevNode.right = root;
			root.left = null;
			prevNode = root;
		}     

		flattenBTToSkewed(rightNode);       
	}


	static void traverseRightSkewed(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data + " ");
		traverseRightSkewed(root.right);       
	}

	// Driver Code
	public static void main (String[] args)
	{
		bstToSkewChange tree = new bstToSkewChange();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		flattenBTToSkewed(node);
		traverseRightSkewed(headNode);
	}
}



