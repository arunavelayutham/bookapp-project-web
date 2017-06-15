package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.Ordermodel;





public class orderDAO{

	public void addorder(Ordermodel user) throws Exception {
		 
		 Connection con = ConnectionUtil.getConnection();
	        
	        String sql = "insert into orders(user_id,book_id,quantity,satus,ordered_date) values ( ?, ?, ? ,? ,?)";
	        
PreparedStatement pst=con.prepareStatement(sql);
pst.setInt(1,user.getUser_id());
pst.setInt(2,user.getBook_id());
pst.setInt(3,user.getQuantity());
pst.setString(4, user.getSatus());
pst.setDate(5,Date.valueOf(user.getOrdered_date()));

int rows=pst.executeUpdate();
System.out.println("no of rows inserted:"+rows);
	 
	}

	 public List<Ordermodel> listorder() throws Exception{
		 Connection con = ConnectionUtil.getConnection();
		 String sql = "select id, user_id ,book_id,quantity,satus,ordered_date from orders";
		 PreparedStatement pst=con.prepareStatement(sql);
		 List<Ordermodel> orderList = new ArrayList<Ordermodel>();
		 
		 ResultSet rs =pst.executeQuery();
		 while(rs.next()){
			 int id =rs.getInt("id");
			 int user_id =rs.getInt("user_id");
			 int book_id =rs.getInt("book_id");
			 int quantity =rs.getInt("quantity");
			 String satus =rs.getString("satus");
			 Date ordered_date =rs.getDate("ordered_date");
			 
			 Ordermodel b =new Ordermodel();
			 b.setId(id);
			 b.setUser_id(user_id);
			 b.setBook_id(book_id);
			 b.setQuantity(quantity);
			 b.setSatus(satus);
			 b.setOrdered_date(ordered_date.toLocalDate());
		
			 
			 
			 orderList.add(b);
		 }
		 
		 
		 
		 
		 return orderList;
}
	}	 
		 	