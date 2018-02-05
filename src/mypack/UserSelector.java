package mypack;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class UserSelector {

	public static void main(String[] args) {
		try
		{
			//connection is obtained
			Connection con=ConnrctionProvider.getConnection();
			Statement stmt=con.createStatement();
			ResultSet rset=stmt.executeQuery("select * from user");
			while(rset.next())
			{
				System.out.println(rset.getInt(1)+"\t"+rset.getString(2)+"\t"+rset.getString(3)+"\t"+rset.getString(4));
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
