package week3.day1;

public class Overloadingusingadd {
	public static void main(String[] args) {
		LearnOverloading object=new LearnOverloading();
		object.add(5, 5);
		object.add(1.1F, 1.1F);
		object.add(1.0F, 2.0F, 3);
		object.add(1, 2, 3);
	}

}
