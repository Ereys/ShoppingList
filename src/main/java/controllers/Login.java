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

@WebServlet(name="Accueil", urlPatterns = {"/", "/Login"})
public class Login extends HttpServlet {
	
	
	
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        try {
        	User user = UserList.getInstanceUserList().authentification(username, password);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect(request.getContextPath() + "/Home");
        }catch(Exception e) {
            	System.out.println("inconnu au bataillon");
                request.setAttribute("erreur", "Utilisateur / mot de passe incorrect");
                request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
}
