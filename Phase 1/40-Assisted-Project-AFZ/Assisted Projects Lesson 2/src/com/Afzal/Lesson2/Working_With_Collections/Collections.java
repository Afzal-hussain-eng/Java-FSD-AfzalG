package com.Afzal.Lesson2.Working_With_Collections;
import java.util.*;
public class Collections {
	public static void main(String[] args) 
	    {
		  //creating array-list
	      System.out.println("ArrayList");
	      ArrayList<String> city=new ArrayList<String>(); 
	      city.add("Hubli");
	      city.add("DVG"); 
	      city.add("BGM"); 
	      city.add("MYS"); 
	      System.out.println(city); 
	      
	      //creating vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(100); 
	      vec.addElement(441); 
	      vec.addElement(500); 
	      vec.addElement(550); 
	      System.out.println(vec);
	      
	      //creating linked-list
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> name=new LinkedList<String>(); 
	      name.add("Afzal"); 
	      name.add("Anusha"); 
	      name.add("Umme"); 
	      
	      Iterator<String> itr=name.iterator(); 
	      while(itr.hasNext()){ 
	      System.out.println(itr.next()); 
	 
	      //creating hash-set
	      System.out.println("\n");
	      System.out.println("HashSet");
	      HashSet<Integer> set=new HashSet<Integer>(); 
	      set.add(265); 
	      set.add(142); 
	      set.add(100);
	      set.add(200);
	      set.add(333);
	      System.out.println(set);
	 
	      //creating linked-hash-set
	      System.out.println("\n");
	      System.out.println("LinkedHashSet");
	      LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>(); 
	      set2.add(111); 
	      set2.add(222); 
	      set2.add(444);
	      set2.add(333); 
	      set2.add(555); 
	      System.out.println(set2);
	      } 
	   } 
	}
/*OUTPUT
ArrayList
[Hubli, DVG, BGM, MYS]

Vector
[100, 441, 500, 550]

LinkedList
Afzal

HashSet
[100, 200, 265, 333, 142]

LinkedHashSet
[111, 222, 444, 333, 555]
Anusha

HashSet
[100, 200, 265, 333, 142]

LinkedHashSet
[111, 222, 444, 333, 555]
Umme

HashSet
[100, 200, 265, 333, 142]

LinkedHashSet
[111, 222, 444, 333, 555]

*/	