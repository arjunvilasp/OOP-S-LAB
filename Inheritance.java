import java.util.*;


class Person{
  
  String name,gender,address;
  int age;
  Person(String name,String gender,String address,int age){
   
   this.name=name;
   this.gender=gender;
   this.address=address;
   this.age=age;
  
  } 
  
  void Display(){
  
   System.out.println();
   System.out.println("Name :"+name+",Gender:"+gender+",Address:"+address+",Age:"+age);
  }

 }
 
 class Employee extends Person{
  String company_name,qualification;
  int emp_id,salary;
  Employee(String name,String gender,String address,int age,String company_name,String qualification,int salary,int emp_id){
  
   super(name,gender,address,age);
   
   this.company_name=company_name;
   this.qualification=qualification;
   this.emp_id=emp_id;
   this.salary=salary;
  
  }
  
  void Display(){
   super.Display();
   System.out.println();
   System.out.println("Company Name:"+company_name+", Qualification:"+qualification+", Salary:"+salary+", Employee ID:"+emp_id);
  }
 }
 
 class Teacher extends Employee{
  String subject,department;
  int teacher_id;
  Teacher(String name,String gender,String address,int age,String company_name,String qualification,int salary,int emp_id,String subject,String department,int teacher_id){
  
   super(name,gender,address,age,company_name,qualification,salary,emp_id);
   
   this.subject=subject;
   this.department=department;
   this.teacher_id=teacher_id;
  
  }
  
  void Display(){
   super.Display();
   System.out.println();
   System.out.println("Subject:"+subject+", Department:"+department+", Teacher ID:"+teacher_id);
  }
 }
 
 public class Inheritance {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Number of teachers: ");
		int n = input.nextInt();
		
		Teacher[] obj = new Teacher[n];
		
		for(int i = 0; i < n ; i++) {
						
			System.out.print("Enter Person Name: ");
			String name = input.next();
			
			System.out.print("Enter Person Age: ");
			int age = input.nextInt();
			
			System.out.print("Enter Person Gender: ");
			String Gender = input.next();
			
			System.out.print("Enter Person Address: ");
			String Address = input.next();
			
			
			System.out.print("Enter Employee Company_name: ");
			String Company_name = input.next();
			
			System.out.print("Enter Employee Empid: ");
			int Empid = input.nextInt();
			
			System.out.print("Enter Employee Qualification: ");
			String Qualification = input.next();
			
			System.out.print("Enter Employee Salary : ");
			int Salary  = input.nextInt();
			
			
			System.out.print("Enter Teacher ID: ");
			int tid = input.nextInt();
			
			System.out.print("Enter Teacher Subject: ");
			String Subject = input.next();
			
			System.out.print("Enter Teacher Department : ");
			String Department  = input.next();
			
			
			obj[i] = new Teacher(name, Gender, Address,age,Company_name,Qualification,Salary,Empid,Subject,Department,tid);
			
			System.out.println(" ");
		}
		
		for(int i = 0; i < n ; i++) {
			obj[i].Display();
			
		}
		
	}

}
 
 
