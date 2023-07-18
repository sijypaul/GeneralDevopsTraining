import java.io.*;
public class HelloWorld
{
	public static void main(String args[]) 
	{
		
		//DataInputStream d= new DataInputStream(System.in);
		//System.out.println("Enter a number:");
		int x= Integer.parseInt(args[0]);
		if(x==5)
		   System.out.println("Hello World....");
		else
		   System.out.println("Wrong Input...Enter again....");
		
	}
}
