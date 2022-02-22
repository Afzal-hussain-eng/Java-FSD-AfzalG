package com.Afzal.Lesson3.Thread_Synchronization;
import java.io.*; 
import java.util.*; 
class Sender { 
 public void send(String msg) { 
 System.out.println("Sending\t" + msg ); 
 try{ 
 Thread.sleep(1000); 
 } catch (Exception e) { 
 System.out.println("Thread interrupted."); 
 	} 
 System.out.println("\n" + msg + "Sent"); 
 	} 
} 
class ThreadedSend extends Thread { 
 private String msg; 
 private Thread t; 
 Sender sender; 
 ThreadedSend(String m, Sender obj) { 
 msg = m; 
 sender = obj; 
 } 
 
 public void run() { 
 synchronized(sender) { 
 sender.send(msg); 
 	} 
 } 
}
public class Sync_Demo {
	public static void main(String args[]) 
	 { 
	 Sender snd = new Sender(); 
	 ThreadedSend S1 = 
	 new ThreadedSend( " Hello " , snd ); 
	 ThreadedSend S2 = 
	 new ThreadedSend( " Godbye " , snd ); 
	 S1.start(); 
	 S2.start(); 
	 try{ 
	 S1.join(); 
	 S2.join(); 
	 }catch(Exception e){ 
	 System.out.println("Interrupted"); 
	 		} 
	 	} 
	} 
/*OUTPUT
Sending	 Hello 
//1sec
Hello Sent
Sending	 Godbye 
//1sec
Godbye Sent
*/