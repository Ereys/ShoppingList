package controllers;

import java.io.IOException;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="EditList", urlPatterns = {"/EditList"})
public class EditListServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;
   

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String listName = request.getParameter("listName");
        String newName = request.getParameter("newName");
        response.sendRedirect("ShoppingList");
    }
}
