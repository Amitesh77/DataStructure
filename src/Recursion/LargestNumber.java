package Recursion;

public class LargestNumber {
	
	static int  highest=Integer.MIN_VALUE;
	
	public static int Largest(int[] a,int n)
	{
		
		
		if(n==-1)
		{
			return highest;
		}
		
		else if(a[n]>highest)
		{
			highest=a[n];
		}
		
		return Largest(a,n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b= {34,67,23,89,90,45,78,455};
		int size=b.length;
		
		int lar=Largest(b,size-1);
		
		System.out.println(lar);

	}

}
