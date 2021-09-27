import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/edit")
public class EditServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        for (User el : Signup.userList.getList()){
            if(el.getEmail().equals(email)){
                req.setAttribute("user", el);
                req.getRequestDispatcher("edit.jsp").forward(req, resp);
                break;
            }
        }
    }
}
