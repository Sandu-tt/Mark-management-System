
import java.util.*;

class coursework{
	static Scanner scan=new Scanner(System.in);
	static int marks[][]=new int[0][2];  //mark is the array to store students marks.
	static String SID[][]=new String[0][2];  //SID is the array to store student ID and name.
	
	public static void main(String args[]){
		while(true){
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|			WELCOME TO GDSE MARKS MANAGEMENT SYSTEM  	  			  |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("[1] Add New Student 			    	 	[2] Add New Student With Marks");
		System.out.println("[3] Add Marks			           		[4] Update Student Details");
		System.out.println("[5] Update Marks			    		[6] Delete Student");
		System.out.println("[7] Print Student Details 			 	[8] Print Student Ranks");
		System.out.println("[9] Best in Programming Fundamentals   			[10] Best in Database Management System");
		System.out.println();
		
		
		
	
		System.out.print("\nEnter your option to continue > ");
		int option= scan.nextInt();
		
		clearConsole();
		
		switch(option){
			case 1: 
				addStudent();
				break;
			case 2: 
				addStudentWithMarks();
				break;
			case 3: 
				addMarks();
				break;
			case 4: 
				updateDetails();
				break;
			case 5: 
				updateMarks();
				break;
			case 6: 
				deleteStudent();
				break;
			case 7:
				printDetails();
				break;
			case 8:
				printRanks();
				break;
			case 9:
				bestPRF();
				break;
			case 10:
				bestDMBS();
				break;
			default :
				}
			}
		}
	
	public static void addStudent(){	//method of add student [1]
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|					ADD NEW STUDENT  			  		  |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		
		char option='y';
		while(option=='y'){
			arraysIncrement();
			
			while(true){
				System.out.print("\nEnter Student ID : ");
				SID[SID.length-1][0]=scan.next();
				
				int count=0;
				for(int i=0; i<SID.length-1;i++){
					if(SID[SID.length-1][0] .equals (SID[i][0])){
						count++;
						}
					}
					
				if(count==0){
					break;
				}else{
					System.out.println("The Student ID Already Exist!");
					}
				
				}
			
			System.out.print("Enter Student name : ");
			SID[SID.length-1][1]=scan.next();
			System.out.println();
			
			System.out.print("Student has been added successfully.");
			
			while(true){
				System.out.print("Do you want to add new student(y/n) : ");
				option=scan.next().charAt (0);
				
				if(option=='y' || option=='n'){
					break;
				}else{
					System.out.print("Invalid Input. Try again!");
					}
				}	
			}
			
			clearConsole();
		}
		
	public static void addStudentWithMarks(){	//method of add new student with marks [2]
		
		char option='y';
		while(option=='y'){
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|			ADD NEW STUDENT WITH MARKS			  		          |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println();
			arraysIncrement();
			
			while(true){
				System.out.print("\nEnter Student ID : ");
				SID[SID.length-1][0]=scan.next();
				
				int count=0;
				for(int i=0; i<SID.length-1;i++){
					if(SID[SID.length-1][0] .equals (SID[i][0])){
						count++;
						}
					}
					
				if(count==0){
					break;
				}else{
					System.out.println("The Student ID Already Exist!");
					}
				
				}
			
			System.out.print("Enter Student name : ");
			SID[SID.length-1][1]=scan.next();
			System.out.println();
			
			while(true){
				System.out.print("ProgrammingFundamentals Mark : ");
				marks[marks.length-1][0]=scan.nextInt();
				
				if(marks[marks.length-1][0]<0 || marks[marks.length-1][0]>100 ){
					System.out.println("Inavlid marks. Please Enter Valid Marks.\n");
				}else{
					break;
					}
				}
			
			while(true){
				System.out.print("Database Management System Mark : ");
				marks[marks.length-1][1]=scan.nextInt();
				
				if(marks[marks.length-1][1]<0 ||marks[marks.length-1][1]>100 ){
					System.out.println("Inavlid marks. Please Enter Valid Marks.\n");
				}else{
					break;
					}
				}
			
			System.out.print("Student has been added successfully.");
			
			while(true){
				System.out.print("Do you want to add new student(y/n) : ");
				option=scan.next().charAt (0);
				
				if(option=='y' || option=='n'){
					break;
				}else{
					System.out.print("Invalid Input. Try again!");
					}
				}	
				
			clearConsole();	
			}
		}
	
	public static void addMarks(){	//method of add marks [3]
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|			ADD   MARKS			  		                	  |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println();
		
		
		
		
		
		char option='y';
		while(option=='y'){
			
			char op1='y';
			int idNo=-1;
			while(true){
				System.out.print("\nEnter Student ID : ");
				String id=scan.next();
				
				for(int i=0; i<SID.length;i++){
					if(id .equals (SID[i][0])){
						idNo=i;
						}
					}
					
				if(idNo==-1){
					System.out.print("Invalid Student ID.");
					
					while(true){
						System.out.print("Do you want to search again(y/n)?");
						option=scan.next().charAt (0);
							
						if(option =='y' ||option =='n'){
							break;
						}else{
							System.out.print("Invalid option.");
							}
						}
							
				}else{
					System.out.println("Student name : "+SID[idNo][1]);
					break;
					}
				if(option =='n'){
				break;
					}
				}
			
			if(option=='n'){
				break;
			}else if(marks[idNo][0]!=0 && marks[idNo][1]!=0){		//Here we consider 0 as no marks entered.
				System.out.println("This student's marks have been already added.\nIf you want to update the marks, please use [5] Update marks option.\n");
				
				while(true){
				System.out.print("Do you want to add marks for another student?(y/n)");
				option=scan.next().charAt(0);
				
					if(option =='y' ||option =='n'){
						break;
					}else{
						System.out.print("Invalid option.");
						}
					}
			}else{
				while(true){
					System.out.print("\nProgrammingFundamentals Mark : ");
					marks[idNo][0]=scan.nextInt();
				
					if(marks[idNo][0]<0 || marks[idNo][0]>100 ){
						System.out.println("Inavlid marks. Please Enter Valid Marks.\n");
					}else{
						break;
						}
					}
			
				while(true){
					System.out.print("Database Management System Mark : ");
					marks[idNo][1]=scan.nextInt();
				
					if(marks[idNo][1]<0 ||marks[idNo][1]>100 ){
						System.out.println("Inavlid marks. Please Enter Valid Marks.\n");
					}else{
						break;
						}
					}
				System.out.print("Marks have been added. ");
				
				while(true){
				System.out.print("Do you want to add marks for another student?(y/n)");
				option=scan.next().charAt(0);
				
					if(option =='y' ||option =='n'){
						break;
					}else{
						System.out.print("Invalid option.");
						}
					}
				}					
			}
			
			clearConsole();
		}
		
	public static void updateDetails(){	//method of update student details [4]
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|			Update Student Details		  		                	  |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println();
		
		char option='y';
		while(option=='y'){
			
			int idNo=-1;
			char option1='y';
			while(option1 =='y'){
				System.out.print("\nEnter Student ID : ");
				String id=scan.next();
				
				for(int i=0; i<SID.length;i++){
					if(id .equals (SID[i][0])){
						idNo=i;
						}
					}
					
				if(idNo==-1){
					System.out.print("Invalid Student ID.");
					
					while(true){
						System.out.print("Do you want to search again(y/n)?");
						option1=scan.next().charAt (0);
							
						if(option1 =='y' ||option1 =='n'){
							break;
						}else{
							System.out.print("Invalid option.");
							}
						}	
					
							
				}else{
					System.out.println("Student name : "+SID[idNo][1]);
					break;
					}
				}
			if(option1 =='n'){
				break;
				}
			
			System.out.print("\nEnter new student name : ");		
			SID[idNo][1] = scan.next();
			
			System.out.println("Student details has been updated successfully.");
			
			while(true){
				System.out.print("Do you want to update another student details (y/n)?");
				option=scan.next().charAt (0);
							
				if(option =='y' ||option =='n'){
					break;
				}else{
					System.out.print("Invalid option.");
					}
				}
			}
			clearConsole();
		
		}
		
	public static void updateMarks(){	//method of update marks [5]
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|			Update     Marks		  		                	  |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println();
		char option='y';
		while(option=='y'){
			
			int idNo=-1;
			char option1='y';
			while(option1 =='y'){
				System.out.print("\nEnter Student ID : ");
				String id=scan.next();
				
				for(int i=0; i<SID.length;i++){
					if(id .equals (SID[i][0])){
						idNo=i;
						}
					}
					
				if(idNo==-1){
					System.out.print("Invalid Student ID.");
					
					while(true){
						System.out.print("Do you want to search again(y/n)?");
						option1=scan.next().charAt (0);
							
						if(option1 =='y' ||option1 =='n'){
							break;
						}else{
							System.out.print("Invalid option.");
							}
						}	
						
				}else if(marks[idNo][0]==0 && marks[idNo][1]==0){
					System.out.print("This student marks yet to be added.");	
					
					while(true){
						System.out.print("Do you want to search again(y/n)?");
						option1=scan.next().charAt (0);
							
						if(option1 =='y' ||option1 =='n'){
							break;
						}else{
							System.out.print("Invalid option.");
							}
						}	
							
				}else{
					System.out.println("Student name : "+SID[idNo][1]);
					
					System.out.println("Programming Fundamentals Marks : "+marks[idNo][0]);
					System.out.println("Database Management Systems Marks : "+marks[idNo][1]);
					
					
					
					
					break;
					}
				}
			if(option1 =='n'){
				break;
				}
			
			while(true){
				System.out.print("\nEnter new programming Fundamentals Marks : ");
				marks[idNo][0]=scan.nextInt();
				
				if(marks[idNo][0]<0 || marks[idNo][0]>100 ){
					System.out.println("Inavlid marks. Please Enter Valid Marks.\n");
				}else{
					break;
					}
				}
			
			while(true){
				System.out.print("Enter new Database Management Systems Marks : ");
				marks[idNo][1]=scan.nextInt();
		
				if(marks[idNo][0]<0 || marks[idNo][0]>100 ){
					System.out.println("Inavlid marks. Please Enter Valid Marks.\n");
				}else{
					break;
					}
				}
			
			System.out.println("Marks have been updated successfully.");
			
			while(true){
				System.out.print("Do you want to update marks for another student(y/n)?");
				option=scan.next().charAt (0);
							
				if(option =='y' ||option =='n'){
					break;
				}else{
					System.out.print("Invalid option.");
					}
				}
			}
			
			clearConsole();
		}
		
	public static void deleteStudent(){	//method of delete student [6]
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|			Delete     Student		  		                	  |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println();
		
		char option='y';
		while(option=='y'){
			
			int idNo=-1;
			
			System.out.print("\nEnter Student ID : ");
			String id=scan.next();
				
			for(int i=0; i<SID.length;i++){
				if(id .equals (SID[i][0])){
					idNo=i;
					}
				}
				
			if(idNo==-1){
				System.out.print("Invalid Student ID.");
				
				while(true){
					System.out.print("Do you want to search again(y/n)?");
					option=scan.next().charAt (0);
							
					if(option =='y' ||option =='n'){
						break;
					}else{
						System.out.print("Invalid option.");
						}
					}
							
			}else{
				String[][] tempSID=new String[SID.length][2];
				int[][] tempMarks=new int[SID.length][2];
			
				for(int i=0; i<SID.length;i++){
					for(int j=0; j<SID[i].length;j++){
						if(idNo!=i){
							tempSID[i][j]=SID[i][j];
							tempMarks[i][j]=marks[i][j];
							}
						
						}
					}
		
				SID=tempSID;
				marks=tempMarks;
					
				System.out.println("Student has benn deleted successfully.");
					
				while(true){
					System.out.print("Do you want to delete another student(y/n)?");
					option=scan.next().charAt (0);
								
					if(option =='y' ||option=='n'){
						break;
					}else{
						System.out.print("Invalid option.");
						}
					}
				}	
			}
		
		clearConsole();
		}
		
	public static void printDetails(){	//method of print student details option [7]
		char option='y';
		while(option=='y'){
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|			Print     Student	Details	  		                	  |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println();
			
			int idNo=-1;
			
			System.out.print("\nEnter Student ID : ");
			String id=scan.next();
				
			for(int i=0; i<SID.length;i++){
				if(id .equals (SID[i][0])){
					idNo=i;
					}
				}
				
			if(idNo==-1){
				System.out.print("Invalid Student ID.");
				
				while(true){
					System.out.print("Do you want to search again(y/n)?");
					option=scan.next().charAt (0);
							
					if(option =='y' ||option =='n'){
						break;
					}else{
						System.out.print("Invalid option.");
						}
					}
			}else {
				System.out.println("Student name : "+SID[idNo][1]);
				
				if(marks[idNo][0]==0 && marks[idNo][1]==0){
					System.out.println("\nMarks yet to be added.");
				
				}else{
					System.out.println("+------------------------------+----------------+");
					System.out.println("|Programming Fundamnetal Marks |              "+marks[idNo][0]+"|");
					System.out.println("|Database Management System    |              "+marks[idNo][1]+"|");
					
					int[] tot= total();
					System.out.println("|Total Marks                   |             "+tot[idNo]+"|");
					
					double[] avg=avg();
					System.out.println("|Avg. Marks                    |            "+avg[idNo]+"|");
					
					String rank=position(idNo);
					System.out.println("|Rank                          |"+(position(idNo))+"|");
					
					System.out.println("+------------------------------+----------------+");
					}
					
				while(true){
					System.out.print("Do you want to search another student details(y/n)?");
					option=scan.next().charAt (0);
							
					if(option =='y' ||option =='n'){
						break;
					}else{
						System.out.print("Invalid option.");
						}
					}
				}
				
			clearConsole();	
			}
		}
	
	public static void printRanks(){	// method of print students' rank option [8]
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|			Print     Student	Rank	  		                	  |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println();

		
		System.out.println("+--------+-----+------------------+--------------+-------------+");
		System.out.println("|Rank    |ID   |Name              |Total Marks   |Avg. Marks   |");
		System.out.println("+--------+-----+------------------+--------------+-------------+");
		
		double[] desc=descending();
		int[] tot =totalDesc();
		String[][] tempSID=SIDDescending();
		
		for(int i=0; i<desc.length;i++){
			if(desc[i]!=0){
				
				System.out.println("|"+(i+1)+"       |"+tempSID[i][0]+" |"+tempSID[i][1]+"             |           "+tot[i]+"|         "+desc[i]+"|");
				}
			}
		
		System.out.println("+--------+-----+------------------+--------------+-------------+");
		
		char option='y';
		while(true){
			System.out.print("Do you want to go back to main menu(y/n)?");
			option=scan.next().charAt (0);
					
			if(option =='y'){
				break;
			}else if(option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid option.");
				}
			}
		
		if(option =='y'){
			clearConsole();
			}
		
		}
	
	public static void bestPRF(){	// method of best in programming fundamental option [9]
			 	 
	System.out.println("---------------------------------------------------------------------------------------------------");
	System.out.println("|			Best    In	Programming 	Fundamentals  		                  |");
	System.out.println("---------------------------------------------------------------------------------------------------");
	System.out.println();
			 
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println("|ID    |Name               |PRF Marks     |DBMS Marks    |");
		System.out.println("+-----+------------------+--------------+-------------+");
		
		int[][] desc=PRFDescending();
		
		String[][] tempSID=SIDDescending();
		
		for(int i=0; i<desc.length;i++){
			if(desc[i][0]!=0 && desc[i][1]!=0){
				
				System.out.println("|"+tempSID[i][0]+" |"+tempSID[i][1]+"             |"+desc[i][0]+"            |"+desc[i][1]+"           |");
				}
			}
		
		System.out.println("+-----+------------------+--------------+-------------+");
		
		char option='y';
		while(true){
			System.out.print("Do you want to go back to main menu(y/n)?");
			option=scan.next().charAt (0);
					
			if(option =='y'){
				break;
			}else if(option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid option.");
				}
			}
		
		if(option =='y'){
			clearConsole();
			}
		}
		
	public static void bestDMBS(){  // method of best in database management System option [10]
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println("|			Best   In	Database Management System 		                  |");
		System.out.println("---------------------------------------------------------------------------------------------------");
		System.out.println();
		
	
		System.out.println("+-----+------------------+--------------+-------------+");
		System.out.println("|ID   |Name              |DBMS Marks    |PRF Marks    |");
		System.out.println("+-----+------------------+--------------+-------------+");
		
		int[][] desc=DBMSDescending();
		
		String[][] tempSID=SIDDescending();
		
		for(int i=0; i<desc.length;i++){
			if(desc[i][0]!=0 && desc[i][1]!=0){
				
				System.out.println("|"+tempSID[i][0]+" |"+tempSID[i][1]+"             |"+desc[i][1]+"            |"+desc[i][0]+"           |");
				}
			}
		
		System.out.println("+-----+------------------+--------------+-------------+");
		
		char option='y';
		while(true){
			System.out.print("Do you want to go back to main menu(y/n)?");
			option=scan.next().charAt (0);
					
			if(option =='y'){
				break;
			}else if(option =='n'){
				System.out.println();
			}else{
				System.out.print("Invalid option.");
				}
			}
		
		if(option =='y'){
			clearConsole();
			}
		}
		
	public static int[] total(){	// get total of marks
		
		int tot[] = new int[marks.length];
		
		for(int i=0;i<tot.length;i++){
			tot[i]=marks[i][0]+marks[i][1];
			}
			
		return tot;
		}
	
	public static int[] totalDesc(){ // arrange total array in descneding order
		
		int tot[] = total();
		
		for(int i=0;i<tot.length-1;i++){
			for(int j=0;j<tot.length-1;j++){
				if(tot[j]<tot[j+1]){
					int temp = tot[j];
					tot[j]=tot[j+1];
					tot[j+1]=temp;
					}
				}
			}
		return tot;
		}
	
	public static double[] avg(){	// get average(avg) from the total
		int[] tot = total();
		double[] avg= new double[marks.length];
		
		for(int i=0;i<avg.length;i++){
				avg[i]=(double)tot[i]/2;
			}
		
		return avg;
		}
		
	public static double[] descending(){	// average marks descending order from avg
		double[] desc= avg();
			
		for(int i=0;i<desc.length-1;i++){
			for(int j=0;j<desc.length-1;j++){
				if(desc[j]<desc[j+1]){
					double temp = desc[j];
					desc[j]=desc[j+1];
					desc[j+1]=temp;
					}
				}
			}
			
		return desc;
		}
				
	public static String[][] SIDDescending(){  // SID descending order according to avg
		double[] desc =descending();
		double[] avg=avg();
		String[][] tempSID=new String[desc.length][2];
			
		for (int i = 0; i < desc.length; i++){
			for(int j = 0; j < avg.length; j++){
				if(desc[i]==avg[j]){
					tempSID[i][0]=SID[j][0];
					tempSID[i][1]=SID[j][1];
					}
					
				}
			}
			return tempSID;
		}
	
	public static int[][] PRFDescending(){	//descending order according to PRF marks
		int[][] desc= new int[marks.length][2];
		
		for(int i=0; i<desc.length;i++){
			desc[i][0]=marks[i][0];
			}
		
		for(int i=0;i<desc.length-1;i++){
			for(int j=0;j<desc.length-1;j++){
				if(desc[j][0]<desc[j+1][0]){
					int temp = desc[j][0];
					desc[j][0]=desc[j+1][0];
					desc[j+1][0]=temp;
					}
				}
			}
			
		for (int i = 0; i < desc.length; i++){
			for(int j = 0; j < desc.length; j++){
				if(desc[i][0]==marks[j][0]){
					desc[i][1]=marks[j][1];
					}
					
				}
			}
			
		return desc;
		}	
		
	public static String[][] SIDDescendingPRF(){	//descending order according to PRF marks
		int[][] desc=PRFDescending();
		String[][] tempSID=new String[desc.length][2];
			
		for (int i = 0; i < desc.length; i++){
			for(int j = 0; j < desc.length; j++){
				if(desc[i][0]==marks[j][0]){
					tempSID[i][0]=SID[j][0];
					tempSID[i][1]=SID[j][1];
					}
					
				}
			}
			return tempSID;
		}
		
	public static int[][] DBMSDescending(){	//descending order according to DBMS marks
		int[][] desc= new int[marks.length][2];
		
		for(int i=0; i<desc.length;i++){
			desc[i][1]=marks[i][1];
			}
		
		for(int i=0;i<desc.length-1;i++){
			for(int j=0;j<desc.length-1;j++){
				if(desc[j][1]<desc[j+1][1]){
					int temp = desc[j][1];
					desc[j][1]=desc[j+1][1];
					desc[j+1][1]=temp;
					}
				}
			}
			
		for (int i = 0; i < desc.length; i++){
			for(int j = 0; j < desc.length; j++){
				if(desc[i][1]==marks[j][1]){
					desc[i][0]=marks[j][0];
					}
					
				}
			}
			
		return desc;
		}
		
	public static String[][] SIDDescendingDBMS(){	//SID descending order according to DBMS marks
		int[][] desc=DBMSDescending();
		String[][] tempSID=new String[desc.length][2];
			
		for (int i = 0; i < desc.length; i++){
			for(int j = 0; j < desc.length; j++){
				if(desc[i][1]==marks[j][1]){
					tempSID[i][0]=SID[j][0];
					tempSID[i][1]=SID[j][1];
					}
					
				}
			}
			return tempSID;
		}
	
	public static String position(int index){ // id's rank
		double[] desc =descending();
		double[] avg=avg();
		
		int r=0;		// here r is the numerical value of the rank		
		for (int i = 0; i < desc.length; i++){
			if(avg[index]==desc[i]){
				r=i+1;
				}
			}
		
		String rank="null";
		if(desc[desc.length-1]==avg[index]){
			rank="         "+r+"(Last)";
		}else{
			switch (r){
				case 1:
					rank="        "+r+"(First)";
					break;
				case 2:
					rank="       "+r+"(Second)";
					break;
				case 3:
					rank="        "+r+"(Third)";
					break;
				case 4:
					rank="       "+r+"(Fourth)";
					break;
				case 5:
					rank="        "+r+"(Fifth)";
					break;
				case 6:
					rank="        "+r+"(Sixth)";
					break;
				case 7:
					rank="      "+r+"(Seventh)";
					break;
				case 8:
					rank="      "+r+"(Eightth)";
					break;
				case 9:
					rank="       "+r+"(nineth)";
					break;
				case 10:
					rank="       "+r+"(tenth)";
					break;
				default :
					rank="      "+r+"("+r+"th)";
				}
			
			}
		return rank;
		
		}
		
	public final static void clearConsole() { //method to clear diplaying iteams
		try {
			final String os = System.getProperty("os.name"); 
			if (os.contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			} else {
				System.out.print("\033[H\033[2J"); 
				System.out.flush();
				}
			} catch (final Exception e) {
			e.printStackTrace();
			// Handle any exceptions.
			}
		}
		
	public static void arraysIncrement(){ //Increment the SID and marks arrays 
		String[][] tempSID=new String[SID.length+1][2];
		int[][] tempMarks=new int[SID.length+1][2];
			
		for(int i=0; i<SID.length;i++){
			for(int j=0; j<SID[i].length;j++){
			tempSID[i][j]=SID[i][j];
			tempMarks[i][j]=marks[i][j];
				}
			}
			
		SID=tempSID;
		marks=tempMarks;
		}
	}
	
