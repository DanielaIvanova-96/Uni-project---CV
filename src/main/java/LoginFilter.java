import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.LogRecord;

@WebFilter(urlPatterns = "/user")
public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpReq = (HttpServletRequest) request;
        HttpSession session = httpReq.getSession(false);

        ((HttpServletRequest) request).getSession().getAttribute("user");

        if(session == null || session.getAttribute("user") == null) {
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            if (request.getParameter("email") != null) {

//                String email = request.getParameter("email");
//
//                User u = new User();
//
//                for(User element : Signup.userList) {
//                    if(element.getEmail().equals(email)) {
//                        u = element;
//                        break;
//                    }
//                }
//
//                request.setAttribute("user", u);
//                request.getRequestDispatcher("welcome.jsp").forward(request, response);
                chain.doFilter(request, response);

            } else {
                request.setAttribute("user", (User) ((HttpServletRequest) request).getSession().getAttribute("user"));
                chain.doFilter(request, response);
            }

        }

    }

}
