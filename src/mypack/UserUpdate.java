package mypack;
import java.sql.*;
import java.util.Scanner;
public class UserUpdate {

	public static void main(String[] args) {
		try
		{
		Connection con=ConnrctionProvider.getConnection();
		PreparedStatement stmt=con.prepareStatement("update user set username=?,email=?,password=? where id=?");
		Scanner in=new Scanner(System.in);
		System.out.println("Enter user id");
		Integer ids=in.nextInt();
		System.out.println("Enter username");
		String name=in.nextLine();
		System.out.println("Enter Email id");
		String email=in.nextLine();
		System.out.println("Enter Password");
		String pass=in.nextLine();
		in.close();
		stmt.setString(1, name);
		stmt.setString(2, email);
		stmt.setString(3, pass);
		stmt.setInt(4, ids);
		int updated=stmt.executeUpdate();
		if(updated>0)
		{
			System.out.println("Successfully updated");
		}
		else
		{
			System.out.println("No Record Updated");
		}
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
