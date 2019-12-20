package datastructure;

//left->root->right.
public class InOrderTree {

	static class Node
	{
		int value;
		Node left,right;
		
		Node(int value)
		{
			this.value=value;
			left=null;
			right=null;
		}
	}
	public void insert(Node node,int value)
	{
		if(value<node.value)
		{
			if(node.left != null)
			{
				insert(node.left,value);
			}
			else
			{
				System.out.println("Inserted "+value+" to left of "+node.value);
				node.left=new Node(value);
			}
		}
		else if(value>node.value)
		{
			if(node.right!=null)
			{
				insert(node.right,value);
			}
			else
			{
				System.out.println("Inserted "+value+" to rigth of "+node.value);
				node.right=new Node(value);
			}
		}
	}
	
	public void travelInOrder(Node node)
	{
		if(node != null)
		{
			travelInOrder(node.left);
			System.out.print(" "+node.value);
			travelInOrder(node.right);
		}
	}
	public static void main(String args[])
	{
		
		InOrderTree inOrderTree=new InOrderTree();
		Node root=new Node(10);
		System.out.println("Binary tree Exmaple \nIn order Traversal \n root value is "+root.value);
		inOrderTree.insert(root, 2);
		inOrderTree.insert(root, 5);
		inOrderTree.insert(root, 12);
		inOrderTree.insert(root, 16);
		inOrderTree.insert(root, 7);
		inOrderTree.insert(root, 11);
		inOrderTree.travelInOrder(root);
	
	}
}
