package hotel;
import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Room {
	public Connection Con1()
	{
		Connection con=null;
		try
		{
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/prodapt","root","root");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
	Scanner sc=new Scanner (System.in);
	
	public void DeluxeRoom() throws SQLException{
		Connection con=Con1();
		String s1="insert into deluxeroom(RoomNo,name,gender,ContactNo,count) values (?,?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(s1);
		
		System.out.println("Enter Room Number");
		int RoomNo=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Gender");
		String gender=sc.next();
		System.out.println("Enter Contact Number");
		String ContactNo=sc.next();
		System.out.println("Number of persons");
		int count=sc.nextInt();
		
		stmt.setInt(1, RoomNo);
		stmt.setString(2, name);
		stmt.setString(3, gender);
		stmt.setString(4, ContactNo);
		stmt.setInt(5, count);
		int a=stmt.executeUpdate();
		System.out.println("\n\t\t\t\tYOUR DELUXEROOM BOOKED");
	}
	public void LuxuryRoom() throws SQLException{
		Connection con=Con1();
		String s1="insert into luxuryroom(RoomNo,name,gender,ContactNo,count) values (?,?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(s1);
		
		System.out.println("Enter Room Number");
		int RoomNo=sc.nextInt();
		System.out.println("Enter Name");
		String name=sc.next();
		System.out.println("Enter Gender");
		String gender=sc.next();
		System.out.println("Enter Contact Number");
		String ContactNo=sc.next();
		System.out.println("Number of persons");
		int count=sc.nextInt();
		
		stmt.setInt(1, RoomNo);
		stmt.setString(2, name);
		stmt.setString(3, gender);
		stmt.setString(4, ContactNo);
		stmt.setInt(5, count);
		int a=stmt.executeUpdate();
		System.out.println("\n\t\t\t\t\t LUXURYROOM BOOKED");
	}
	
}
