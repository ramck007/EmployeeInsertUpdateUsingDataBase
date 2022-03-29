import java.util.*;

//import java.io.Serializable;
import java.sql.*;

public class EmpWidDataBase {

	public static void main(String[] args) throws SQLException {
		
		//employee e[]=new employee[2];
		System.out.println("Please wait until SQL got Connected");
		Scanner sc= new Scanner(System.in);
		int id; String name,location; long number;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","1234");
			Statement smt = con.createStatement();
			System.out.println("Connected now Enter Y to Start :)");
			char ch=sc.next().charAt(0);
		//	EmpWidDataBase empd = new EmpWidDataBase(); 
			if(ch=='y'||ch=='Y') {
				System.out.println("1.Select all \n2.Insert \n3.Select Particular Field \n4.Update \n5.Delete\n0.Exit");
				int n=sc.nextInt();
				while(true) {
					if(n<=5) {
				switch(n) {
				case 1:	String sql1 = "select * from emp;";
						ResultSet rs= smt.executeQuery(sql1);
						while(rs.next()) {
							System.out.println("Employee id       : "+rs.getInt(1)+"\nEmployee Name     : "+rs.getString(2)+"\nEmployee Number   : "+rs.getLong(3)+"\nEmployee Location : "+rs.getString(4));
							System.out.println();
						}
						break;
				case 2: System.out.println("Enter the Employee ID"); 
				  		id = sc.nextInt();
				  		System.out.println("Enter the Employee Name"); 
				  		name= sc.next();
				  	//	sc.nextLine();
				  		System.out.println("Enter the Employee Number");
				  		number = sc.nextLong();
				  		System.out.println("Enter the Employee Location"); 
				  		location= sc.next();
				  		String sql = "insert into emp values(?,?,?,?);"; 
				  		PreparedStatement stmt = con.prepareStatement(sql); 
				  		stmt.setInt(1,id);
				  		stmt.setString(2, name);
				  		stmt.setLong(3, number); 
				  		stmt.setString(4, location);
				  		stmt.execute();
				  		break;
				case 3: System.out.println("Enter the id to get the Employee Details");
				 		int k= sc.nextInt(); 
				 		sql1 = "select * from emp where id="+k+";";
				 		//sql1 = "select * from emp where id=";
				 		String sql2 ;//= sql1+k+";";
						
				 		rs=smt.executeQuery(sql1);
						  while(rs.next()) 
						  { System.out.println("Employee id       : "+rs.getInt(1)+"\nEmployee Name     : "+rs.getString(2)+"\nEmployee Number   : "+rs.getLong(3)+"\nEmployee Location : "+rs.getString(4)); System.out.println(); 
						  }
						 
						break;
				case 4: System.out.println("Will Update Soon");
						System.out.println("Choose to Update \n1.Name \n2.Number \n3.Location");
						int m= sc.nextInt();
						switch(m) {
						case 1: System.out.println("Enter the id to update");
								int n1=sc.nextInt();
								System.out.println("Enter the name to Change");
								String s1=sc.next();
								String sql4="update emp set ename ='"+s1+"' where id ="+n1+";";
								stmt = con.prepareStatement(sql4);
								 stmt.execute();
								 break;
						case 2: System.out.println("Enter the id to update");
								n1=sc.nextInt();
								System.out.println("Enter the number to Change");
								long l1=sc.nextLong();
								sql4="update emp set number ="+l1+" where id ="+n1+";";
								stmt = con.prepareStatement(sql4);
								stmt.execute();
								break;
						case 3: System.out.println("Enter the id to update");
								n1=sc.nextInt();
								System.out.println("Enter the name to Change");
								s1=sc.next();
								sql4="update emp set location ='"+s1+"' where id ="+n1+";";
								stmt = con.prepareStatement(sql4);
								stmt.execute();
								break;
							
						}
						
						break;
				case 5:	 System.out.println("Enter the id to delete");
						 int d=sc.nextInt();
						 sql2 = "delete from emp where id="+d+";";
						// String sql3=sql2+d+";";
						 //System.out.println(sql3);
						// rs=smt.executeQuery(sql3);
						 stmt = con.prepareStatement(sql2);
						 stmt.execute();
						 break;
				case 0:
					System.out.println("Bye Bye");
					
					System.exit(0);
					break;
				default: System.out.println("Enter values between 1 to 5");break;
				
				}
				}
					else {
						System.out.println("Enter between 1 to 5");
					}
					System.out.println("1.Select all \n2.Insert \n3.Select Particular Field \n4.Update \n5.Delete \n");
					System.out.println("Enter the Key");
					 n=sc.nextInt();
					 if(n>4) {
						 break;
					 }
			}}
			else {
					System.out.println("OOPS Wrong Press");
				}
			
				
				con.close();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		/*	for(int i=0;i<3;i++) {
			  System.out.println("Enter the Employee ID"); 
			  id = sc.nextInt();
			  System.out.println("Enter the Employee Name"); 
			  name= sc.next();
			  System.out.println("Enter the Employee Number");
			  number = sc.nextLong();
			  System.out.println("Enter the Employee Location"); 
			  location= sc.next();
			  String sql = "insert into emp values(?,?,?,?);"; 
			  PreparedStatement stmt = con.prepareStatement(sql); 
			  stmt.setInt(1,id);
			  stmt.setString(2, name);
			  stmt.setLong(3, number); 
			  stmt.setString(4, location);
			  stmt.execute();
			}
			 System.out.println("Enter the id to get the Employee Details");
			 int k= sc.nextInt(); 
		//int i = 2;
		String sql1 = "select * from emp where id =";
		String sql2 = sql1+k+";";*/
		/*
		 * String sql1 = "select * from emp;"; ResultSet rs= smt.executeQuery(sql1);
		 * while(rs.next()) { System.out.println("Employee id       : "+rs.getInt(1)
		 * +"\nEmployee Name     : "+rs.getString(2)+"\nEmployee Number   : "+rs.getLong
		 * (3)+"\nEmployee Location : "+rs.getString(4)); System.out.println(); }
		 */
		
	//	System.out.println("Executed");
			
			
			
		/*
		 * //ResultSet rs=smt.executeQuery("Create Database sample"); // ResultSet
		 * rs=smt.executeQuery("select * from samp1"); while(rs.next()) {
		 * System.out.println(rs.getInt(1)+" "+rs.getInt(2)); }
		 */
			
			
		

		/*for(int i=0;i<2;i++) {
			System.out.println("Enter the Employee ID");
			id = sc.nextInt();
			System.out.println("Enter the Employee Name");
			name= sc.next();
			System).out.println("Enter the Employee Number");
			number = sc.nextLong();
			System.out.println("Enter the Employee Location");
			location= sc.next();
			System.out.println("");*/
			
		//	e[i]=new employee(id,name,number,location);
		
		//}
		
		
		
		/*
		 * ObjectInputStream inputStream = new ObjectInputStream(new
		 * FileInputStream("empfile")); Object obj=null;
		 * 
		 * while((obj=inputStream.readObject()) instanceof endoffile==false ) {
		 * System.out.println("Employee id       : "+((employee)obj).id);
		 * System.out.println("Employee Name     : "+((employee)obj).name);
		 * System.out.println("Employee Number   : "+((employee)obj).number);
		 * System.out.println("Employee Location : "+((employee)obj).location);
		 * System.out.println(""); }
		 */
	}
}

