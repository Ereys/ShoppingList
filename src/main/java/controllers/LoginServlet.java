package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.User;
import wrapper.DaoInterface;
import wrapper.IWrapperUser;
import wrapper.WrapperUser;

import java.io.IOException;

@WebServlet(name="Accueil", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {
	
	
	
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        try {
        	IWrapperUser userWrapper = new WrapperUser();
            HttpSession session = request.getSession();
            
            User user = userWrapper.logInIfPasswordAndUsernameCorrect(username, password);
            if(user != null) {
                session.setAttribute("user", user);
                response.sendRedirect(request.getContextPath() + "/Home");
            }else {
                request.setAttribute("erreur", "Utilisateur / mot de passe incorrect");
                request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            }
        }catch(Exception e) {
                request.setAttribute("erreur", "Utilisateur / mot de passe incorrect");
                request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }
    }
}
