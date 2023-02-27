package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.User;

import java.io.IOException;

/**
 * Home
 */


@WebServlet(name="Home", urlPatterns = {"/home"})
public class GestionListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.getServletContext().getRequestDispatcher("WEB-INF/home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if(user != null) {
        	user.getListManager().addShoppingList(name);
        }else {
        	response.sendRedirect("login.jsp");
        }
	}

	@Override
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if(user != null) {
        	user.getListManager().deleteShoppingList(name);
        }else {
        	response.sendRedirect("login.jsp");
        }
	}
}
