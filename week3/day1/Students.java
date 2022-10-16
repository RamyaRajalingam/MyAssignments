package week3.day1;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println(id);
	}
	public void getStudentInfo(int id,String name)
	{
		System.out.println(id);
		System.out.println(name);
	}
	public void getStudentInfo(int id,double Phone,String email)
	{
		System.out.println(id);
		System.out.println(Phone);
		System.out.println(email);
		this.getStudentInfo(id, email);;
	}
	
	public static void main(String[] args) 
	{
		Students studentinfo=new Students();
		System.out.println("First method");
		studentinfo.getStudentInfo(12345);
		System.out.println("Second method");
		studentinfo.getStudentInfo(12345, "Ramya");
		System.out.println("ThirdMethod and also id amd email of second method");
		studentinfo.getStudentInfo(12345, 987651, "ram@gmail.com");
		
	}
}
