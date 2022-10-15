package org.system;

public class Desktop extends Computer 
{
	public void desktopsize() 
	{
		System.out.println("Desktop Size");
	}
 public static void main(String[] args)
 {
	Computer obj=new Computer();
	obj.computerModel();
	Desktop obj1=new Desktop();
	obj1.desktopsize();
	System.out.println("Below one is inherited from computer class");
	obj1.computerModel();
}
}
