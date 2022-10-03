package assignments_week1;
//Declaring Global Variables-Creating Objects and printing the values
public class TwoWheeler {
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber= 4567892345L;
	boolean isPunctured= false;
	String bikeName= "Royal Enfield";
	double runningKM=4324.345;
	
public static void main(String[] args) {
	
	TwoWheeler obj=new TwoWheeler();
	System.out.println(obj.noOfWheels);
	System.out.println(obj.noOfMirrors);
	System.out.println(obj.chassisNumber);
	System.out.println(obj.isPunctured);
	System.out.println(obj.bikeName);
	System.out.println(obj.runningKM);
}
}

