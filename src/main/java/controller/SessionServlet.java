package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SessionServlet", value = "/SessionServlet")
public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("isLoggedIn", "session");
        RequestDispatcher rd = request.getRequestDispatcher("LoggedIn.jsp");
        rd.forward(request, response);
    }
}
