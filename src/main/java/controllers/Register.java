package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.User;
import models.UserList;

import java.io.IOException;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User(username, password);

        UserList.getInstanceUserList().addUser(user);
        HttpSession session = request.getSession();
        session.setAttribute("user", user);

        response.sendRedirect("home.jsp");
    }
}
