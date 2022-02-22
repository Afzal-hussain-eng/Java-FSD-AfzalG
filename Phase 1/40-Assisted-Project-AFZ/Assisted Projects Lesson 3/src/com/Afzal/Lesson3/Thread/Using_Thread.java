package com.Afzal.Lesson3.Thread;

public class Using_Thread extends Thread{
	public void run()
	{
	 System.out.println("concurrent thread started running..");
	}
	public static void main( String args[] )
	{
		Using_Thread thread = new Using_Thread();
	 thread.start();
    }
}
/*OUTPUT
concurrent thread started running..
*/