package com.Afzal.Lesson2.Working_Maps;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		// map
		//Hashmap
		HashMap<Integer,String> HM=new HashMap<Integer,String>(); 
		HM.put(1,"Liya"); 
		HM.put(2,"Diya"); 
		HM.put(3,"seeya"); 
	 
		System.out.println("\nThe elements of Hashmap are "); 
		for(Map.Entry m:HM.entrySet()){ 
		System.out.println(m.getKey()+" "+m.getValue()); 
	 }
	 
		//HashTable
	 
		 Hashtable<Integer,String> ht=new Hashtable<Integer,String>(); 
		 
		 ht.put(4,"Johan"); 
		 ht.put(5,"Jhonny"); 
		 ht.put(6,"Janardhan"); 
		 ht.put(7,"Tara"); 
		 System.out.println("\nThe elements of HashTable are "); 
		 for(Map.Entry n:ht.entrySet()){ 
		 System.out.println(n.getKey()+" "+n.getValue()); 
	 }
	 
	 
		 //TreeMap
	 
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>(); 
		 map.put(8,"Ammu"); 
		 map.put(9,"Buta"); 
		 map.put(10,"Bomma"); 
	 
		 System.out.println("\nThe elements of TreeMap are "); 
		 for(Map.Entry l:map.entrySet()){ 
		 System.out.println(l.getKey()+" "+l.getValue()); 
	 } 
	 
	 } 
	}
/*OUTPUT

The elements of Hashmap are 
1 Liya
2 Diya
3 seeya

The elements of HashTable are 
7 Tara
6 Janardhan
5 Jhonny
4 Johan

The elements of TreeMap are 
8 Ammu
9 Buta
10 Bomma

*/	