package controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name="EditArticle", urlPatterns = {"/editArticle"})
public class EditArticleServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String listName = request.getParameter("listName");
        String articleName = request.getParameter("articleName");
        int qtt = Integer.parseInt(request.getParameter("qtt"));
        String newArticleName = request.getParameter("newArticleName");
        int newQtt = Integer.parseInt(request.getParameter("newQtt"));
        
    }
}
