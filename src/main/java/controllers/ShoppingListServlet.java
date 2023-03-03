package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.User;

import java.io.IOException;


@WebServlet(name="List", urlPatterns = {"/List/*"})
public class ShoppingListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        if(user != null) {
        	try {
	            String[] url = request.getPathInfo().split("/");
	            String name = url[url.length-1];
	            
	            request.setAttribute("shoppingList", user.getListManager().getShoppingListByName(name)); 
        	}catch(Exception e) {
        		request.setAttribute("error", e.getMessage()); // display the error message
        		
        	}finally {   
			this.getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        	}
        }else { // not connected
            response.sendRedirect(request.getContextPath() + "/Login");
        }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        String articleName = request.getParameter("articleName");
        int qtt = Integer.parseInt(request.getParameter("qtt"));
        
        if(user != null) {
            String[] url = request.getPathInfo().split("/");
            String name = url[url.length-1];
            user.getListManager().getShoppingListByName(name).addArticle(articleName, qtt);
            this.doGet(request, response);
        }else {
            response.sendRedirect(request.getContextPath() + "/Login");
        }
	}
}
