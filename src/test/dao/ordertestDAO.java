package test.dao;

import java.time.LocalDate;
import java.util.List;

import dao.orderDAO;
import model.Ordermodel;



public class ordertestDAO {
	
	

	
		
		public static void main(String[] args) throws Exception {
			 LocalDate L=LocalDate.parse("2017-06-13");
	        Ordermodel user = new Ordermodel();
	        user.setId(1);
	        user.setUser_id(1);
	        user.setBook_id(2);
	        user.setQuantity(3);
	        user.setSatus("ordered");
	        user.setOrdered_date(L);
	        
	        
	 
	        orderDAO userDAO = new orderDAO();
	      // userDAO.addorder(user);
	        List<Ordermodel> orderList=userDAO.listorder();
			 System.out.println(orderList);
			 for (Ordermodel b: orderList){
				 
				 System.out.println(b);
			 
				 }

	  
		}
	 
	}
