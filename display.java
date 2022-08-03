package hotel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class display {
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
	
	public void displaydeluxeroom() throws SQLException
	{
		Connection con=Con1();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from deluxeroom");
		while(rs.next())
			System.out.println("RoomNo= "+rs.getInt(1)+" "+"Name= "+rs.getString(2)+" "+"Gender= "+rs.getString(3)+" "+"ContactNo= "+rs.getString(4)+" "+"Number of Persons= "+rs.getInt(5));
	}
	
	public void displayluxuryroom() throws SQLException
	{
		Connection con=Con1();
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from deluxeroom");
		while(rs.next())
			System.out.println("RoomNo="+rs.getInt(1)+" "+"Name= "+rs.getString(2)+" "+"Gender= "+rs.getString(3)+" "+"ContactNo= "+rs.getString(4)+" "+"Number of Person= "+rs.getInt(5));
	}
}
