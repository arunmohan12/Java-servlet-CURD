package aaaa1.org;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataDeo {
	static Connection connect;
	static PreparedStatement pst;
	

	public static int insert(String id, String name, String mail) {
		int status=0;
		try {
			connect=Connector.getConnection();
			pst=connect.prepareStatement("insert into employee values(?,?,?)");
			pst.setString(1, id);
			pst.setString(2, name);
			pst.setString(3, mail);
			status=pst.executeUpdate();
			connect.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return status;	
	}
public static List<Data> Display() {
	List<Data>list=new ArrayList<Data>();
	try {
		connect=Connector.getConnection();
	pst=connect.prepareStatement("select * from employee");
	ResultSet res=pst.executeQuery();
	while(res.next())
	{
		Data d=new Data();
		d.setId(res.getString(1));
		d.setName(res.getString(2));
		d.setMail(res.getString(3));
		list.add(d);
	}
	}
	catch (Exception e) {
		System.out.println(e);
	}
	return list;
}
public static List<Data> Displayone(String id) {
	List<Data>list=new ArrayList<Data>();
	try {
		connect=Connector.getConnection();
	pst=connect.prepareStatement("select * from employee where id=?");
	pst.setString(1, id);
	ResultSet res=pst.executeQuery();
	while(res.next())
	{
		Data d=new Data();
		d.setId(res.getString(1));
		d.setName(res.getString(2));
		d.setMail(res.getString(3));
		list.add(d);
	}
	}
	catch (Exception e) {
		System.out.println(e);
	}
	return list;
}
public static int Delete(String id) throws SQLException {
	try {
		connect=Connector.getConnection();
		pst=connect.prepareStatement("delete from employee where id=?");
		pst.setString(1, id);
		pst.executeUpdate();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	return 0;
}
public static int Update(Data user) throws SQLException {
	
	try {
		connect=Connector.getConnection();
		pst=connect.prepareStatement("update employee set name=?, mail=? where id=?");
		
		pst.setString(1,user.getName());
		pst.setString(2, user.getMail());
		pst.setString(3, user.getId());
		pst.executeUpdate();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
	
}
}

