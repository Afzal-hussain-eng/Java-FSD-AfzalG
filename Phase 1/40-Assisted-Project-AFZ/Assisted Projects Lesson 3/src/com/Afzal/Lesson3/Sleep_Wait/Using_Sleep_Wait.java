package com.Afzal.Lesson3.Sleep_Wait;

public class Using_Sleep_Wait {

		 private static Object LOCK = new Object();
		 public static void main(String args[]) throws InterruptedException
		 {
			 Thread.sleep(5000);
			 System.out.println("Thread '" + Thread.currentThread().getName() + "' is woken after sleeping for 5 second");
			 synchronized (LOCK) 
			 {
			 LOCK.wait(5000);
			 System.out.println("Object '" + LOCK + "' is woken after" + " waiting for 5 second");
		    }
	    }
	}

/*
OUTPUT
Thread 'main' is woken after sleeping for 5 second
Object 'java.lang.Object@5c8da962' is woken after waiting for 5 second
*/