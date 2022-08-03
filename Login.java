package hotel;
import java.util.*;
import java.sql.SQLException;

public class Login {
	public static void main(String[] args) throws SQLException {
		Room r=new Room();
		display d=new display();
		System.out.println("\t\t\t\t\tHOTEL RESERVATION");
		System.out.println("\nEnter Your Login Details");
		
		System.out.println("\nEnter your Username");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("Enter your Password");
		String p=sc.next();
		
		if(s.equals("Dhinesh")&&p.equals("Dhino"))
		{
			System.out.println("\nChoose Room type :\n\n1.Deluxe Room\n2.Luxury Room\n3.Display book Details");
			
			int i=sc.nextInt();
			Room rr=new Room();
			
			switch(i){
			case 1:
				rr.DeluxeRoom();
				break;
			case 2:
				rr.LuxuryRoom();
				break;
			case 3:
				System.out.println("\nChoose Room type :");
				System.out.println("\n\t1.Deluxe Room");
				System.out.println("\n\t2.Luxury Room");
				int a=sc.nextInt();
				if(a==1)
				{
				d.displaydeluxeroom();
				break;
				}else if(a==2)
				{
					d.displayluxuryroom();
					break;
				}else
				{
					System.out.println("Entered Invalid Option");
					break;
				}
			default :
				System.out.println("Wrong Choice");
				break;
			}
		}
		else
			System.out.println("Invalid Username or Invalid Password");
		
	}
}
