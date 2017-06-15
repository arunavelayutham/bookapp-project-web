package test.dao;

import java.time.LocalDate;

import dao.bookDAO;
import model.usermodel;

public class usertestDAO {
	
	public static void main(String[] args) throws Exception {
		 LocalDate L=LocalDate.parse("2017-06-08");
        usermodel user = new usermodel();
        user.setName("pri");
        user.setPrice(200);
        user.setPub_date(L);
        user.setAuthor_id(1);
        
        
 
        bookDAO userDAO = new bookDAO();
       // userDAO.register(user);
        userDAO.listbook();
  
	}
 
}



