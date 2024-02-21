package project;

import java.util.Scanner;

public class Student_Id_Card {
	
	
	
	
	
	
	static void student1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id:");
		int id=sc.nextInt();
		
		System.out.println("Enter the Student name:");
		String name=sc.next();
		
		System.out.println("Enter  the Student Roll No: ");
		long roll=sc.nextLong();
		
		System.out.println("Enter the Students Address:");
		String dd=sc.next();
		
		System.out.println("Enter the Student Blood Group:");
		String bg=sc.next();
		
		
		System.out.println("The details of Student 1 are :");
		System.out.println("Student id is :"+id);
		System.out.println("Student name is: "+name);
		System.out.println("Student roll number:"+roll);
		System.out.println("Student Address is :"+dd);
		System.out.println("Student Blood Group is :"+bg);
		System.out.println("*************Thank you**********");
	}
	
	
	
	static void student2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id:");
		int id=sc.nextInt();
		
		System.out.println("Enter the Student name:");
		String name=sc.next();
		
		System.out.println("Enter  the Student Roll No: ");
		long roll=sc.nextLong();
		
		System.out.println("Enter the Students Address:");
		String dd=sc.next();
		
		System.out.println("Enter the Student Blood Group:");
		String bg=sc.next();
		
		System.out.println("The details of Student 2 are :");
		System.out.println("Student id is :"+id);
		System.out.println("Student name is: "+name);
		System.out.println("Student roll number:"+roll);
		System.out.println("Student Address is :"+dd);
		System.out.println("Student Blood Group is :"+bg);
		System.out.println("*************Thank you**********");
	}
	
	
	
	static void student3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id:");
		int id=sc.nextInt();
		
		System.out.println("Enter the Student name:");
		String name=sc.next();
		
		System.out.println("Enter  the Student Roll No: ");
		long roll=sc.nextLong();
		
		System.out.println("Enter the Students Address:");
		String dd=sc.next();
		
		System.out.println("Enter the Student Blood Group:");
		String bg=sc.next();
		
		System.out.println("The details of Student 3 are :");
		System.out.println("Student id is :"+id);
		System.out.println("Student name is: "+name);
		System.out.println("Student roll number:"+roll);
		System.out.println("Student Address is :"+dd);
		System.out.println("Student Blood Group is :"+bg);
		System.out.println("*************Thank you**********");
	}
	
	static void student4()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student id:");
		int id=sc.nextInt();
		
		System.out.println("Enter the Student name:");
		String name=sc.next();
		
		System.out.println("Enter  the Student Roll No: ");
		long roll=sc.nextLong();
		
		System.out.println("Enter the Students Address:");
		String dd=sc.next();
		
		System.out.println("Enter the Student Blood Group:");
		String bg=sc.next();
		
		System.out.println("The details of Student 4 are :");
		System.out.println("Student id is :"+id);
		System.out.println("Student name is: "+name);
		System.out.println("Student roll number:"+roll);
		System.out.println("Student Address is :"+dd);
		System.out.println("Student Blood Group is :"+bg);
		System.out.println("*************Thank you**********");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("******Enter your Choice*********");
		System.out.println("1-Student1:\n"+ "2-Student2:\n"+"3-Student3:\n"+"4-Student4:\n");
		System.out.println("Enter your Choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		
		case 1: student1();
		break;
		
		case 2: student2();
		break;
		
		case 3:student3();
		break;
		
		case 4:student4();
		break;
		
		
		default:System.out.println("Wrong information entered:");
		
		}
		
	}

}
