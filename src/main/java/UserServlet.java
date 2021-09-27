import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/user")
public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //String email = req.getParameter("email");

        if(req.getSession().getAttribute("user") != null) {
            User elem = (User) req.getSession().getAttribute("user");

            req.setAttribute("user", elem);
            req.getRequestDispatcher("welcome.jsp").forward(req, resp);
        }else
            resp.sendRedirect("login.jsp");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        User elem = (User) req.getSession().getAttribute("user");

        elem.setName(req.getParameter("name"));
        elem.setWork(req.getParameter("work"));
        elem.setDescription(req.getParameter("description"));
        elem.setPhone(req.getParameter("phone"));
        elem.setCity(req.getParameter("city"));
        elem.setStreet(req.getParameter("street"));

        req.getSession().setAttribute("user", elem);
        req.setAttribute("user", elem);

        for (User el: Signup.userList.getList()
             ) {
            if(el.getEmail().equals(elem.getEmail())){
                el = elem;

                break;
            }
        }

        resp.sendRedirect("user?email=" + elem.getEmail());

    }
}
