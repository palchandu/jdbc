package mypack;
import java.sql.*;
import java.util.Scanner;
public class UserSaver {

	public static void main(String[] args) {
		try
		{
			Connection con=ConnrctionProvider.getConnection();
			PreparedStatement stmt=con.prepareStatement("Insert into user(username,email,password) values(?,?,?)");
			Scanner in=new Scanner(System.in);
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
			stmt.execute();
			con.close();
			System.out.println("Successfully Saved");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
