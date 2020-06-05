package web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(description = "MaServlet",name = "Login", value = {"/Login"})
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter pr = response.getWriter();
        pr.println("voila");

        String name = request.getParameter("nom");
        String password = request.getParameter("passw");
        System.out.println("in servlet - login: " + name + " pw: " + password);
        if (name.equals("admin") && password.equals("passw") ){
            response.sendRedirect(request.getContextPath() + "/jsp/page1.jsp");
        }
        else{
            response.sendRedirect("index.jsp");
        }
    }
}
