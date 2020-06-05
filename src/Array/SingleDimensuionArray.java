package Array;

public class SingleDimensuionArray {
	
	int [] arr=null;
	
	public SingleDimensuionArray(int sizeofArray)
	{
		
		arr=new int[sizeofArray];
		
		for (int i = 0; i < arr.length; i++) 
		
		{
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	
	
	//traverse
	public void traverse()
	{
		for (int i = 0; i < arr.length; i++) {
			
			
			try
			{
				System.out.println(arr[i]+"  ");
			}
			
			catch(Exception e)
			{
				System.out.println("Array no longer exists");
			}
			
		}
	}
	
	
	
	//insert in an array
	
	public void insert(int location,int valueTobeInserted)
	{
		
		try
		{
			if(arr[location]==Integer.MIN_VALUE)
			{
				arr[location]=valueTobeInserted;
				
				System.out.println("Value Successfully inserted   "+valueTobeInserted + "   at  " +location);
			}
			
			else
			{
				System.out.println("The cell is already occupied");
			}
		}
		
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SingleDimensuionArray a=new SingleDimensuionArray(10);
		
		a.traverse();
		
		a.insert(2, 10);

	}

}
