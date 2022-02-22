package com.Afzal.Lesson4.Stack_Queue;
import java.util.*;
public class Queue {
	public static void main(String[] args){
	 LinkedList <String> largestCityQueue = new LinkedList<>();
	 
	 	largestCityQueue.add("Tokyo");
	 	largestCityQueue.add("Delhi");
	 	largestCityQueue.add("Shanghai");
	 	largestCityQueue.add("Sao_Paulo");
	 	largestCityQueue.add("Maxico");
	 	largestCityQueue.add("Cairo");
	 	largestCityQueue.add("Dhaka");
	 	largestCityQueue.add("Mumbai");
	 	
	 System.out.println("Queue is : " + largestCityQueue);
	 
	 System.out.println("Head of Queue : " + largestCityQueue.peek());
	 
	 	largestCityQueue.remove();
	 	
	 System.out.println("After removing Head of Queue : " + largestCityQueue);
	 
	 System.out.println("Size of Queue : " + largestCityQueue.size());
		}
	}
/*OUTPUT
Queue is : [Tokyo, Delhi, Shanghai, Sao_Paulo, Maxico, Cairo, Dhaka, Mumbai]
Head of Queue : Tokyo
After removing Head of Queue : [Delhi, Shanghai, Sao_Paulo, Maxico, Cairo, Dhaka, Mumbai]
Size of Queue : 7
*/