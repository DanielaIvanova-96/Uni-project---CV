import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/skills")
public class SkillsSaveServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Skills skills = new Skills();
        User elem = (User) req.getSession().getAttribute("user");

        int java = Integer.parseInt(req.getParameter("java"));
        int html = Integer.parseInt(req.getParameter("html"));
        int css = Integer.parseInt(req.getParameter("css"));
        int js = Integer.parseInt(req.getParameter("js"));

        int comm = Integer.parseInt(req.getParameter("comm"));
        int tw = Integer.parseInt(req.getParameter("team"));
        int creative = Integer.parseInt(req.getParameter("creative"));

        skills.setJavaSkill(java);
        skills.setHtmlSkill(html);
        skills.setCssSkill(css);
        skills.setJsSkill(js);

        skills.setCommSkill(comm);
        skills.setTwSkill(tw);
        skills.setCrSkill(creative);

        elem.setSkills(skills);
        req.getSession().setAttribute("user", elem);

        for(User user : Signup.userList.getList()) {
            if(user.getEmail().equals(elem.getEmail())) {
                user = elem;
            }
        }

        resp.sendRedirect("user?email=" + elem.getEmail());
    }
}
