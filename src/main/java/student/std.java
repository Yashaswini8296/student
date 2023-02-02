package student;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.UserDAO;
import DTO.User;

@WebServlet("/details")
public class std extends  HttpServlet  {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	User user=new User();
	
	user.setId(req.getParameter("id"));
	user.setName(req.getParameter("name"));
	user.setAddress(req.getParameter("address"));
	user.setEmail(req.getParameter("email"));
	user.setGender(req.getParameter("gender"));
	user.setMobile(Long.parseLong(req.getParameter("mobile")));
	user.setPassword(req.getParameter("password"));
	user.setHobbies(req.getParameter("hobbies"));
	
	//UserDAO userdao =new UserDAO();
	
    resp.getWriter().print("<h1>Data Added Successfully</h1>");
	{
    req.getRequestDispatcher("add.html").include(req,resp);	
}
}
}
	