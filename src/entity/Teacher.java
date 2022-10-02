package entity;

import java.util.Scanner;
public class Teacher extends Person{
	  int teacherId;
	  String department;
	  double salary;

	  
	  
	  public Teacher(){
		  
	  }
	  Teacher(int teacherId, String firstName, String lastName, String department , String city,String Gender, double salary){
         this.teacherId =  teacherId;
         this.firstName = getFirstName();
         this.lastName = getLastName();
         this.department = department;
         this.city = getCity();
         this.Gender=getGender();
         this.salary = salary;
	  
}
	
	  
	  public void insert() {
		  
		  Scanner sc=new Scanner(System.in);
		  
		  System.out.println("Enter Teacher rollNo");
		  teacherId=sc.nextInt();
		  
		  System.out.println("Enter Teacher FirstName");
		  setFirstName(sc.next());
		  
		  System.out.println("Enter Teacher LastName");
		  setLastName(sc.next());
		  
		  System.out.println("Enter Teacher department");
		  department=sc.next();
		  
		  System.out.println("Enter Teacher city");
		  setCity(sc.next()); 
		  
		  System.out.println("Enter Teacher Gender");
		  setGender(sc.next());
		  
		  System.out.println("Enter Teacher salary");
		  salary=sc.nextDouble();
	  }
	  public void display() {
		  System.out.println("teacherId "+teacherId+"\n"+"First Name "+getFirstName()+"\n"+"Last Name "+getLastName()+"\n"
				  +"Department "+department+"\n"+"Gender "+getGender()+"\n"+"city "+getCity()+"\n"+"salary "+salary);
	  }
	  
	  public Teacher searchByTeacherId(Teacher[] array , int teacherId) {
			
			for(int i = 0 ; i < array.length ; i++) {
				
				if(array[i].teacherId  == teacherId)
					return array[i];
				
			}
			
			
			return null;
			
		}

		public Teacher[] searchByTeacherDepartment(Teacher[] array, String department) {
			
			Teacher[] arr = new Teacher[array.length];
			
			   for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].department .equals(department)) {
					   arr[j] = array[i];
				   }   
			   }
			return arr;
		}
		public Teacher[] searchByTeacherFirstName(Teacher[] array,String firstName) {
			
			Teacher[] arr=new Teacher[array.length];
			
			  for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].getFirstName() .equals(firstName)) {
					    arr[j] = array[i];
				   }   
			   }
			
			return arr;
			
		}
		public Teacher[] searchByTeacherLastName(Teacher[] array,String lastName) {
			Teacher[] arr=new Teacher[array.length];
			
			  for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].getLastName() .equals(lastName)) {
					    arr[j] = array[i];
				   }   
			   }
			return arr;
		}
		public Teacher[] searchByTeacherGender(Teacher[] array,String Gender) {
			Teacher[] arr=new Teacher[array.length];
			
			  for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].getGender() .equals(Gender)) {
					    arr[j] = array[i];
				   }   
			   }
			
			return arr;
			
		}
		
		public Teacher[] searchByTeacherCity(Teacher[] array,String city) {
			Teacher[] arr=new Teacher[array.length];
			
			  for(int i = 0 , j = 0; i< array.length ; i++) {
				   
				   if(array[i].getCity() .equals(city)) {
					    arr[j] = array[i];
				   }   
			   }
			
			return arr;
			
		}
		
		
		public void exit() {
			System.out.println("Exit teacher record successfully");
		}  
	  
	  
}