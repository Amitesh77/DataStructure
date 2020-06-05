package TreeDemo;

public class LLMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinarybyLL tree=new BinarybyLL();
		
		//insert 10 Nodes
		
		System.out.println("Inserting 10 Nodes"); 
		for (int i = 0; i<=10; i++)
		{
			tree.insert(i*10);
		}
		
		
		tree.levelOrderTraversal();
	}

}
