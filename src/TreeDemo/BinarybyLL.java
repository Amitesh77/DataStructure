package TreeDemo;

import java.util.LinkedList;
import java.util.Queue;

public class BinarybyLL {
	
	
	BinaryNode root;

	
	
	//Constructor for creating a blank binary tree
	public BinarybyLL() {
		
		this.root = root;
	}
	
	
	
	//insert a new   node in the deepest place 
	
	public void insert(int value)
	
	{
		BinaryNode node=new BinaryNode();
		
		node.setValue(value);
		
		if(root==null)
		{
			root=node;
			
			System.out.println("Successfully inserted new Node at root");
			return;
		}
		
	Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
	
	queue.add(root);
	
	while(!queue.isEmpty())
	{
	
		BinaryNode presentNode=queue.remove();
		
		if(presentNode.getLeft()==null)
		{
			presentNode.setLeft(node);
			
			System.out.println("Successfully Inserted a new node!!!!!!" );
			
			break;
		}
		
		else if(presentNode.getRight()==null)
		{
			presentNode.setRight(node);
			
			System.out.println("Successfully inserted anew node  !!!!");
			
			break;
			
		}
		
		else
		{
			queue.add(presentNode.getLeft());
			
			queue.add(presentNode.getRight());
		}
		
		
		
	}
	
	
	
	}
	
	
	public void levelOrderTraversal()
	{
		
		Queue<BinaryNode> queue=new LinkedList<BinaryNode>();
		
		queue.add(root);
		
		
		while(!queue.isEmpty())
		{
			BinaryNode presentNode=queue.remove();
			System.out.println(presentNode.getValue()+  "  ");
			
			if(presentNode.getLeft()!=null)
			{
				System.out.println(presentNode.getValue());
			}
			
			if(presentNode.getRight()!=null)
			{
				System.out.println(presentNode.getValue()+  "  ");
			}
			
		}
		
	}
	
	
	
	
	
	
	

}
