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


@WebServlet(name="Home", urlPatterns = {"/Home", "/List"})
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if(user != null) {
			request.getSession().setAttribute("shoppingList", user.getListManager().getShoppingLists());
			this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        }else {
            response.sendRedirect(request.getContextPath() + "/Login");
        }
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if(user != null) {
        	user.getListManager().addShoppingList(name);
        }else {
            response.sendRedirect(request.getContextPath() + "/Login");
        }
	}
}
