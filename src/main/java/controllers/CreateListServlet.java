package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.ShoppingList;
import models.User;
import wrapper.IWrapperShoppingList;
import wrapper.WrapperShoppingList;

import java.io.IOException;

@WebServlet(name="CreateList", urlPatterns = {"/CreateList"})
public class CreateListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if(user != null) {
			this.getServletContext().getRequestDispatcher("/WEB-INF/createList.jsp").forward(request, response);
        }else {
            response.sendRedirect(request.getContextPath() + "/Login");
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if(user != null) {
        	IWrapperShoppingList wrap = new WrapperShoppingList();
        	wrap.create(new ShoppingList(name));
            response.sendRedirect(request.getContextPath() + "/Home");
        }else {
            response.sendRedirect(request.getContextPath() + "/Login");
        }
	}
}
