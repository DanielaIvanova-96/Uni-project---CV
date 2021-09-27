import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Cookie cookie = new Cookie("user", "user1");

        if(req.getSession().getAttribute("user") != null) {

            req.getSession().invalidate();
            resp.addCookie(cookie);
            resp.sendRedirect("menu");
        } else {
            resp.sendRedirect("login");
        }


    }
}
