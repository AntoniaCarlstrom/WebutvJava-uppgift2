package controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import model.UserBean;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "loginServlet", value = "/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("un");
        String pass = request.getParameter("pw");


        UserBean user = new UserBean();
        user.setUserName(name);
        user.setPassWord(pass);

        String passWord = user.getPassWord();
        String userName = user.getUserName();

        if (userName.equals("Antonia") && passWord.equals("hejhej") || userName.equals("Admin") && passWord.equals("hejhej2")) {
            UserBean userBean = new UserBean();
            userBean.setPassWord(passWord);
            userBean.setUserName(userName);
            request.setAttribute("UserBean", userBean);

            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("isLoggedIn", "session");
            RequestDispatcher rd = request.getRequestDispatcher("loggedIn.jsp");
            rd.forward(request, response);

        } else {
            out.print("Wrong password and/or username");
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            requestDispatcher.include(request, response);
        }




    }
}
