package week1.day2;

//import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int input=153;
		int calculated=0;//c
		int remainder;//r
		int original=input;//o
		
		while(input>0) {
			remainder=input%10;
			input=input/10;
			calculated=calculated+(remainder*remainder*remainder);
			if (calculated==original)
				System.out.println(calculated+ " is a Armstrong Number");
			
			}
			
				
	}

}
