package week3.day1;

public class Audi extends Car{
	public void hybridFuel()
	{
		
System.out.println("hybridFuel");
}
	public void applyBreak()
	{
		
System.out.println("Apply Break -ABS");
super.applyBreak();
this.hybridFuel();

}
}
