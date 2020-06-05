package HashTable;

public class HashTable {

	String[] hashArray;
	
	int arraySize;
	
	int size=0;  //counter for number of elements in the array
	
	public HashTable(int noOfslots)
	{
		
		
		if(isPrime(noOfslots))
		{
			hashArray=new String[noOfslots];
			
			arraySize=noOfslots;
		}
		
		else
		{
			int primeCount=getNextPrime(noOfslots);
			hashArray=new String[primeCount];
			arraySize=primeCount;
			
			System.out.println("HashTable size given  "+noOfslots  +"is not a prime number");
			
			System.out.println("HashTable size changed to  "+primeCount  );
		}
	}
	
	private boolean isPrime(int num)
	{
		for(int i=2;i*i<=num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		
		return true;
	}
	
	private int getNextPrime(int minNumber)
	{
		for(int i=minNumber;true;i++)
		{
			if(isPrime(i))
			{
				return i;
			}
		}
	}
	
	
	private int hashFunc1(String word)
	{
		int hashVal=word.hashCode();
		
		if(hashVal<0)
		{
			hashVal+=arraySize;
		}
		
		return hashVal;    //ideal index position for inserting or searching
		
		
		
	}
	
//returns step size
private int hashFunc2(String word)
{
	int hashVal=word.hashCode();
	
	hashVal=hashVal%arraySize;
	
	if(hashVal<0)
	{
		hashVal+=arraySize;
	}
	
	return 3-hashVal%3;
}

public void insert(String word)
{
	int hashVal=hashFunc1(word);
	int stepSize=hashFunc2(word);
	
	while(hashArray[hashVal]!=null)
	{
		hashVal=hashVal+stepSize;
		hashVal=hashVal%arraySize;
	}
	
	hashArray[hashVal]=word;
	System.out.println("Inserted word  "+hashVal);
	
	size++;
	
}

public String find(String word)
{
	int hashVal=hashFunc1(word);
	int stepSize=hashFunc2(word);
	
	while(hashArray[hashVal]!=null)
	{
		
		if(hashArray[hashVal].equals(word))
		{
			return hashArray[hashVal];
		}
		hashVal=hashVal+stepSize;
		hashVal=hashVal%arraySize;
	}
	
	return hashArray[hashVal];
}


}