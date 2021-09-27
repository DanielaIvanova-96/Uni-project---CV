import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet("/profil")
public class ProfilSaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User elem = (User) req.getSession().getAttribute("user");

        elem.setName(req.getParameter("name"));
        elem.setWork(req.getParameter("job"));
        elem.setDescription(req.getParameter("info"));

        req.getSession().setAttribute("user", elem);
        req.setAttribute("users", elem);

        for (User el: Signup.userList.getList()
        ) {
            if(el.getEmail().equals(elem.getEmail())){
                el = elem;

                break;
            }
        }

        resp.sendRedirect("user?email=" + elem.getEmail());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User elem = (User) req.getSession().getAttribute("user");

        req.setAttribute("url", "user");
        req.setAttribute("user", elem);
        req.getRequestDispatcher("profil.jsp").forward(req, resp);
    }
}
