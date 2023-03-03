package controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name="DeleteList", urlPatterns = {"/DeleteList"})
public class DeleteListServlet extends HttpServlet {
	 private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        String listName = request.getParameter("listName");
        response.sendRedirect("ShoppingList");
    }
}