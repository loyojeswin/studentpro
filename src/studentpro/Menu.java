package studentpro;

import java.util.Scanner;

import entity.Student;
import entity.Teacher;

public class Menu {

	
	  static Student e=new Student();
	   static Student[] array =null;
	   
	  static Teacher e1=new Teacher();
	   
	   static Teacher[] arr=null;
	   
	public static void options(){
		int option=0,option1=0,option2=0,num=0,num1=0;
		Scanner sc = new Scanner(System.in);
		
	
		do{	
			  System.out.println(" 1. Student");
			  System.out.println(" 2. Teacher");
			  System.out.println(" 3. Exit");
			  
			   option = sc.nextInt();
			   
			  switch(option) {
				case 1:
						 
					do {
					       System.out.println("1. Insert student record");
					       System.out.println("2. View student records");
					       System.out.println("3. Search student record by roll Number");
					       System.out.println("4. Search student record by First Name");
					       System.out.println("5. Search student record by Last Name");
					       System.out.println("6. Search student record by department");
					       System.out.println("7. Search student record by Gender");
					       System.out.println("8. Search student record by city");
						   System.out.println("9. Exit student portal");

		                   option1 = sc.nextInt();
		                   
							switch(option1)
							{
							case 1:
									System.out.println("number of records");
									num = sc.nextInt();
									array=new Student[num];
									for(int i=0;i<num;i++) {
										
										array[i]=new Student();
										array[i].insert();	
										System.out.println("------------------------------");
									}
									break;
							case 2:
									
									for(int i=0;i<num;i++) {
									
										array[i].display();
										System.out.println("-----------------------------");
									}
									break;
							case 3:
									
									System.out.println(" enter student rollno ");
									int rollNo = sc.nextInt();
									
									Student  std1 = e.searchByStudentId(array , rollNo);// base address ( address of first element)
								
									if(std1 == null) {
										System.out.println(" No such record found");
										System.out.println("------------------------------");
									}
									
									else
										std1.display();
										System.out.println("------------------------------");
				
									break;
									
							case 4:
									
									
									System.out.println(" enter student first Name: ");
									String empFirst = sc.next();// 
									
									Student [] std2 = new Student[array.length];
											std2= e.searchByFirstName(array , empFirst);
									
									for(int i = 0 ; i < std2.length ; i++) {
										if(std2[i] != null) {
										std2[i].display();
										System.out.println("-----------------------------");
										}
										else {
											System.out.println("No record found");
											System.out.println("-----------------------------");
										}
										
									}
				
									break;
							case 5:
									
								System.out.println(" enter student last Name: ");
								String stdLast = sc.next();// 
								Student [] std3 = new Student[array.length];
										std3= e.searchByLastName(array , stdLast);
								
								for(int i = 0 ; i < std3.length ; i++) {
									if(std3[i] != null) {
									std3[i].display();
									System.out.println("------------------------------");
									}
									else {
										System.out.println("No record found");
										System.out.println("------------------------------");
									}
								}
			
								break;
									
							case 6:
								System.out.println(" enter student Department Name: ");
								String dept = sc.next();// 
								Student [] std = new Student[array.length];
										std= e.searchByDepartment(array , dept);
								
								for(int i = 0 ; i < std.length ; i++) {
									if(std[i] != null) {
									std[i].display();
									System.out.println("------------------------------");
									}
									else {
										System.out.println("No record found");
										System.out.println("-----------------------------");
									}
								}
			
								break;
									
							case 7:
									
									System.out.println(" enter Student Gender : ");
									String stdGender = sc.next();// 
									Student [] std4 = new Student[array.length];
									std4= e.searchByGender(array , stdGender);
									
									for(int i = 0 ; i < std4.length ; i++) {
										if(std4[i] != null) {
											std4[i].display();
										System.out.println("------------------------------");
										}
										else {
											System.out.println("No record found");
											System.out.println("-----------------------------");
										}
									}
				
									break;
							case 8:
										System.out.println(" enter Student city : ");
										String stdcity = sc.next();// 
										Student [] std5 = new Student[array.length];
										std5= e.searchByCity(array , stdcity);
										
										for(int i = 0 ; i < std5.length ; i++) {
											if(std5[i] != null) {
												std5[i].display();
											System.out.println("------------------------------");
											}
											else {
												System.out.println("No record found");
												System.out.println("-----------------------------");
											}
										}
									break;
										
									
							case 9:	
										e.exit();
										break;
										
									}
						
						}while(option1!=9);
		
				break;
			  
		case 2:
			 
		do {
		       System.out.println("1. Insert teacher record");
		       System.out.println("2. View teacher records");
		       System.out.println("3. Search teacher record by ID Number");
		       System.out.println("4. Search teacher record by First Name");
		       System.out.println("5. Search teacher record by Last Name");
		       System.out.println("6. Search teacher record by Department Name");
		       System.out.println("7. Search teacher record by Gender");
		       System.out.println("8. Search teacher record by City");
			   System.out.println("9. Exit teacher portal");

             option2 = sc.nextInt();
             
             
	          switch(option2)
					{
					case 1:
							System.out.println("number of records");
							num1 = sc.nextInt();
							arr=new Teacher[num1];
							for(int i=0;i<num1;i++) {
								
								arr[i]=new Teacher();
								arr[i].insert();	
								System.out.println("------------------------------");
							}
							break;
					case 2:
							
							for(int i=0;i<num1;i++) {
							
								arr[i].display();
								System.out.println("------------------------------");
							}
							break;
					case 3:
							
							System.out.println(" enter TeacherId ");
							int teacherId = sc.nextInt();
							
							Teacher  emp1 = e1.searchByTeacherId(arr , teacherId);// base address ( address of first element)
						
							if(emp1 == null) {
								System.out.println(" No such record found");
								System.out.println("-----------------------------");
							}
							
							else
								emp1.display();
								System.out.println("-----------------------------");
		
							break;
							
					case 6:
							
							System.out.println(" enter teacher Department Name: ");
							String dept = sc.next();// 
							Teacher [] teacher = new Teacher[arr.length];
									teacher= e1.searchByTeacherDepartment(arr , dept);
							
							for(int i = 0 ; i < teacher.length ; i++) {
								if(teacher[i] != null) {
								teacher[i].display();
								System.out.println("-----------------------------");
								}
								else {
									System.out.println("No record found");
									System.out.println("-----------------------------");
								}
							}
		
							break;
							
					case 4:
							
							System.out.println(" enter teacher first Name: ");
							String empFirst = sc.next();// 
							
							Teacher [] teacher1 = new Teacher[arr.length];
									teacher1= e1.searchByTeacherFirstName(arr , empFirst);
							
							for(int i = 0 ; i < teacher1.length ; i++) {
								if(teacher1[i] != null) {
								teacher1[i].display();
								System.out.println("-----------------------------");
								}
								else {
									System.out.println("No record found");
									System.out.println("-----------------------------");
								}
								
							}
		
							break;
							
					case 5:
							
							System.out.println(" enter teacher last Name: ");
							String empLast = sc.next();// 
							Teacher [] teacher2 = new Teacher[arr.length];
									teacher2= e1.searchByTeacherLastName(arr , empLast);
							
							for(int i = 0 ; i < teacher2.length ; i++) {
								if(teacher2[i] != null) {
								teacher2[i].display();
								System.out.println("-----------------------------");
								}
								else {
									System.out.println("No record found");
									System.out.println("-----------------------------");
								}
							}
		
							break;
					case 7:
							
							System.out.println(" enter teacher Gender : ");
							String empGender = sc.next();// 
							Teacher [] teacher3 = new Teacher[arr.length];
							teacher3= e1.searchByTeacherGender(arr , empGender);
							
							for(int i = 0 ; i < teacher3.length ; i++) {
								if(teacher3[i] != null) {
								teacher3[i].display();
								System.out.println("-----------------------------");
								}
								else {
									System.out.println("No record found");
									System.out.println("-----------------------------");
								}
							}
		
							break;
					case 8:
								System.out.println(" enter teacher city : ");
								String empcity = sc.next();// 
								Teacher [] teacher4 = new Teacher[arr.length];
								teacher4= e1.searchByTeacherCity(arr , empcity);
								
								for(int i = 0 ; i < teacher4.length ; i++) {
									if(teacher4[i] != null) {
										teacher4[i].display();
									System.out.println("-----------------------------");
									}
									else {
										System.out.println("No record found");
										System.out.println("-----------------------------");
									}
								}
							break;
								
							
					case 9:	
								e1.exit();
								break;
					}
				}while(option2!=9);
				break;
				
		case 3:
			System.out.println("Exit  Application Successfully");
			System.exit(0);
	    }
		}while(option!=4);

	}
	
}
