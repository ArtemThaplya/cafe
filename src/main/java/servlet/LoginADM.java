package servlet;

import login_admin.CheckPassword;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "login_admin")
public class LoginADM extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CheckPassword checkPassword = new CheckPassword();
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        boolean statusLogin = checkPassword.addAdminAndPasswordCheck(login, password);
        if (statusLogin == true){
            response.sendRedirect("/cafe/web/admin_main_inteface.html");
        }else {
            response.sendRedirect("/cafe/web/admin.html");
        }
    }
}
