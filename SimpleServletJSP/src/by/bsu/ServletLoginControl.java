package by.bsu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Igor on 15.10.2016.
 */
@WebServlet(name = "ServletLoginControl")
public class ServletLoginControl extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try
        {
            UserBean user = new UserBean();
            user.setUserName(request.getParameter("un"));
            user.setPassword(request.getParameter("pw"));
            user = UserDAO.login(user);
            if (user.isValid())
            {

                HttpSession session = request.getSession(true);
                session.setAttribute("currentSessionUser", user);
                response.sendRedirect("loggedUser.jsp");
            }
            else
                response.sendRedirect("invalidLogin.jsp");
        }
        catch (Throwable e)
        {
            System.out.println(e);
        }
    }
}
