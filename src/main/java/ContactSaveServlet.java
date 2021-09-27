import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/contact")
public class ContactSaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User elem = (User) req.getSession().getAttribute("user");

        elem.setEmail(req.getParameter("email"));
        elem.setPhone(req.getParameter("phone"));
        elem.setCity(req.getParameter("city"));
        elem.setStreet(req.getParameter("street"));

        req.getSession().setAttribute("user", elem);
        req.setAttribute("user", elem);

        for (User el: Signup.userList.getList())
        {
            if(el.getEmail().equals(elem.getEmail()))
            {
                el = elem;

                break;
            }
        }
        resp.sendRedirect("user?email=" + elem.getEmail());
    }
}
