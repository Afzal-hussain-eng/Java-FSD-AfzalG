package com.Afzal.Lesson2.Working_With_Strings;

public class Demo_String {
	public static void main(String[] args)
    {
			//methods of strings
		System.out.println("_________________________________________________________");
		System.out.println("<-----------Methods of Strings---------->");
			String sl=new String("Hi Afzal");
		System.out.println(sl.length());
		System.out.println("_________________________________________________________");
		//substring
		System.out.println("<-----------substring---------->");
			String sub=new String("Welcome");
		System.out.println(sub);
		System.out.println(sub.substring(2));
		System.out.println("_________________________________________________________");
			//String Comparison
		System.out.println("<-----------String Comparison---------->");
			String s1="Afzal";
			String s2="Afzal";
		System.out.println(s1.compareTo(s2));
		System.out.println("_________________________________________________________");
			//IsEmpty
		System.out.println("<-----------IsEmpty---------->");
			String s4="";
			System.out.println(s4);
		System.out.println("String is empty: "+s4.isEmpty());
		System.out.println("_________________________________________________________");
			//toLowerCase
		System.out.println("<-----------toLowerCase---------->");
			String s5="HELLO";
			System.out.println(s5);
		System.out.println("convert it in to lower "+s5.toLowerCase());
		System.out.println("_________________________________________________________");
			//replace
		System.out.println("<-----------replace---------->");
			String s6="Heldo";
			System.out.println(s6);
			String replace=s6.replace('d', 'l');
		System.out.println("Replace 'd' with 'l' "+replace);
		System.out.println("_________________________________________________________");
			//equals
		System.out.println("<-----------equals---------->");
			String x="ola amigo";
			System.out.println(x);
			String y="OLA AMIGO";
			System.out.println(y);
		System.out.println("Is it equal :"+x.equals(y));
		System.out.println("_________________________________________________________");
		System.out.println("\n");
		System.out.println("<-----------Creating StringBuffer---------->");
			//Creating StringBuffer and append method
			StringBuffer s=new StringBuffer("hello lerner !");
			System.out.println(s);
			s.append("Enjoy your learning");
		System.out.println(s);
			//insert method
			s.insert(0, 'w');
		System.out.println(s);
			//replace method
			StringBuffer sb=new StringBuffer("Hello");
			sb.replace(0, 2, "hEl");
		System.out.println(sb);
			//delete method
			sb.delete(0, 1);
		System.out.println(sb);
		System.out.println("_________________________________________________________");
			//StringBuilder
		System.out.println("\n");
		System.out.println("<-----------Creating StringBuilder---------->");
			StringBuilder sb1=new StringBuilder("Happy");
			sb1.append(" Learning");
		System.out.println(sb1);
		System.out.println(sb1.delete(0, 1));
		System.out.println(sb1.insert(1, "Welcome"));
		System.out.println(sb1.reverse());
		System.out.println("_________________________________________________________");
			//conversion
		System.out.println("\n");
		System.out.println("<-----------Conversion of Strings to StringBuffer and StringBuilder---------->");
			String str = "Hello"; 
			 
		 // conversion from String object to StringBuffer 
			 StringBuffer sbr = new StringBuffer(str); 
			 sbr.reverse(); 
		 System.out.println("String to StringBuffer");
		 System.out.println(sbr); 
			 
		// conversion from String object to StringBuilder 
			 StringBuilder sbl = new StringBuilder(str); 
			 sbl.append(" world"); 
		System.out.println("String to StringBuilder");
		System.out.println(sbl); 
}
}
/*OUTPUT
 _________________________________________________________
<-----------Methods of Strings---------->
8
_________________________________________________________
<-----------substring---------->
Welcome
lcome
_________________________________________________________
<-----------String Comparison---------->
0
_________________________________________________________
<-----------IsEmpty---------->

String is empty: true
_________________________________________________________
<-----------toLowerCase---------->
HELLO
convert it in to lower hello
_________________________________________________________
<-----------replace---------->
Heldo
Replace 'd' with 'l' Hello
_________________________________________________________
<-----------equals---------->
ola amigo
OLA AMIGO
Is it equal :false
_________________________________________________________


<-----------Creating StringBuffer---------->
hello lerner !
hello lerner !Enjoy your learning
whello lerner !Enjoy your learning
hElllo
Elllo
_________________________________________________________


<-----------Creating StringBuilder---------->
Happy Learning
appy Learning
aWelcomeppy Learning
gninraeL yppemocleWa
_________________________________________________________


<-----------Conversion of Strings to StringBuffer and StringBuilder---------->
String to StringBuffer
olleH
String to StringBuilder
Hello world

*/	