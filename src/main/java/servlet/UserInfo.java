package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import jpa.business.User;

@WebServlet(name = "userinfo", urlPatterns = { "/CreateUser" })
public class UserInfo extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		UserDao daoU = new UserDao();
		User user = new User();
		user.setMail(request.getParameter("mail"));
		user.setName(request.getParameter("name"));
		daoU.save(user);

		out.println("<HTML>\n<BODY>\n" + "<H1>Recapitulatif des informations</H1>\n" + "<UL>\n" + " <LI>Nom: "
				+ request.getParameter("name") + "\n" + " <LI>Mail: " + request.getParameter("mail") + "\n" + "</UL>\n"
				+ "</BODY></HTML>");
	}
}
