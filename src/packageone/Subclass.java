package packageone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import packagetwo.Myclass;

 
public class Subclass {
	///yeeeeeaaaazzzzzzzzzz
	/*public void a()
	{
		Myclass m = new Myclass();
		
	  System.out.println(m.x + "");
	}
	*/
	
	public static void main (String[] args) throws IOException
	{
		/*Subclass s = new Subclass();
		s.a();
		*/
		
		/*ArrayList al = new ArrayList();
	      System.out.println("Initial size of al: " + al.size());
	      // add elements to the array list
	      al.add("C");
	      al.add("A");
	      al.add("E");
	      al.add("B");
	      al.add("D");
	      al.add("F");
	      al.add(1, "A2");
	      System.out.println("Size of al after additions: " + al.size());
           // display the array list
	      System.out.println("Contents of al: " + al);
	      // Remove elements from the array list
	      al.remove("F");
	      al.remove(2);
	      System.out.println("Size of al after deletions: " + al.size());
	      System.out.println("Contents of al: " + al);
	      al.add("Hello");
	      al.add(17.2);
	      al.add("Hello");
	      al.ensureCapacity(15);
	      al.add(null);
	      System.out.println("Contents of al: " + al + "Size : " + al.size());
	      
	      ArrayList<String> friendsnames= new ArrayList<String>();
			friendsnames.add("Ankur");
			friendsnames.add("Ajeet");
			friendsnames.add("Harsh");
			friendsnames.add("John");
			//friendsnames.add(20);
			
			ArrayList to Array Conversion 
			String frnames[]=friendsnames.toArray(new String[friendsnames.size()]);

			Displaying Array elements
			for(String k: frnames)
			{
				System.out.println(k);
			}
	   	}*/
		
	//	ArrayList a = new ArrayList(Arrays.asList("b","c","d",5,8,9));
	//	System.out.println(a);
		
	//	Iterator iterator ;
		
	/*	ArrayList<String> b = new ArrayList<String>(Arrays.asList("b","c"));
		String[] cc = b.toArray(new String[b.size()]);
		
		
		for(String s : cc)
		{
			System.out.print(s);
		}
		System.out.println();
		Iterator<String> iterator ;
		iterator = b.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		*/
	/*	
		String input = null;
		BufferedReader in = new BufferedReader(new  
		 InputStreamReader(System.in));
		//System.out.print("Type your name: ");
		input = in.readLine();
		System.out.println("Your Name " + input);
		System.out.print("Type your Age: ");
		int x = Integer.parseInt(in.readLine());
		System.out.println("Your age: "+x);
		in.close();*/
		
		
	/*	ArrayList<Integer> myInts = new ArrayList<Integer>(25);
		System.out.println( "Size of myInts = " + myInts.size());
		for (int k = 0; k < 10; k++)
			myInts.add( 3 * k );//Auto boxing
		myInts.set( 6, 44 );
		System.out.println( "Size of myInts = " + myInts.size());*/
	/*	
		String s = "salam,azizam chetori";
		String[] w = s.split(" "); // removing space
		for(String ss : w)
		{
			System.out.println(ss);
		}
		
		
		ArrayList<String> aaa = new ArrayList<String>(Arrays.asList("omar","mahabub","joynul","mahabub"));
		
		
		TreeSet<String> sss = new TreeSet<String>(aaa);
		
		System.out.println(sss);*/
		
		Hashtable<Integer,String> hTable=new Hashtable<Integer,String>();

        //adding or set items in Hashtable by put method key and value pair
        hTable.put(1, "Java");
        hTable.put(5, "C++");
        hTable.put(3, "CoralDraw");
        hTable.put(4, "SE");
         System.out.println(hTable);
         
         Set keys = hTable.keySet();
         Iterator it = keys.iterator();
         while(it.hasNext())
         {
        	 System.out.println(hTable.get(it.next()));
         }
		
	}
}


