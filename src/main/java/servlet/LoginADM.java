package servlet;

import login_admin.CheckPassword;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "/login")
public class LoginADM extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CheckPassword checkPassword = new CheckPassword();
//        RequestDispatcher dispatcher = request.getRequestDispatcher("web/index.jsp");
//        dispatcher.forward(request, response);
        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        boolean statusLogin = checkPassword.addAdminAndPasswordCheck(login, password);

        if (statusLogin){
            response.sendRedirect("admin_main_inteface.html");
//            response.sendRedirect("http://localhost:8080/web/admin_main_inteface.html");
//            request.getRequestDispatcher("admin_main_inteface.html").forward(request, response);

        }else {
            response.sendRedirect("admin.html");
//            response.sendRedirect("http://localhost:8080/web/admin.html");
//            request.getRequestDispatcher("index.jsp");
        }
        pw.close();
    }
}
