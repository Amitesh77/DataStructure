package HashTable;

import java.util.Hashtable;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashTable table=new HashTable(19);
		
		table.insert("Apple");
		table.insert("Hello");
		table.insert("Felling");
		table.insert("Water");
		table.insert("Africa");
		table.insert("Speed");
		
		table.insert("Phine");
		table.insert("September");
		table.insert("Michael");
		table.insert("Milk");
		table.insert("Huge");
		table.insert("Dogs");
		
		
		System.out.println(table.find("Apple"));
		System.out.println(table.find("Zebra"));
		
		System.out.println(table.find("Feeling"));
		System.out.println(table.find("Water"));
		
		System.out.println(table.find("Feeling"));
		System.out.println(table.find("Africa"));
		

	}

}
