package week3.day1;

public class LearnOverloading {
	public void add(int a,int b) {
	System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		System.out.println(a+b+c);
		}
	public void add(float a,float b) {
		System.out.println(a+b);
		}
	public void add(float a,float b,int c) {
		System.out.println(a+b+c);
		this.add(a, b);
		}
}
