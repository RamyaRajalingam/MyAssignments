package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department
	{
	public void studentName()
	{
		System.out.println("Ramya");
	}
	public void studentDept()
	{
		System.out.println("Studentdept Infor Tech");
	}
	public void studentId()
	{
		System.out.println("studentId- 2609876");
	}
public static void main(String[] args) {
	Student student=new Student();
	student.studentName();
	student.studentDept();
	student.studentId();
	System.out.println("deptname inherited to student");
	student.deptName();
	Department department=new Department();
	department.deptName();
	System.out.println("Department inherited College method ");
	department.collegeCode();
	department.collegeName();
	department.collegeRank();
	System.out.println("Parent-College");
	College college=new College();
	college.collegeCode();
	college.collegeName();
	college.collegeRank();
	}
}
