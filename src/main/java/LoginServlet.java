import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Map;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {


    public static void readxml(){
        File xmlFile = new File("C:\\Users\\Danny\\Java projects\\it_lab5\\src\\main\\webapp\\users.xml");
        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(UsersList.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            UsersList userList = (UsersList) jaxbUnmarshaller.unmarshal(xmlFile);

            if(Signup.userList.getList() == null){
                Signup.userList.setList(new ArrayList<User>());
            }

            for(User user : userList.getList()) {
                Signup.userList.getList().add(user);
            }
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        readxml();

        String email = request.getParameter("email");
        String pass = request.getParameter("pass");

        if ( email.isEmpty() || pass.isEmpty() ) {
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
            rd.include(request, response);
        }else {
            User user = new User();

            for(User elem : Signup.userList.getList()) {

                if(elem.getEmail().equals(email)) {
                    user = elem;
                }
            }

            if(pass.equals(user.getPassword())) {

                request.getSession().setAttribute("user", user);
                request.setAttribute("user", user);
                response.sendRedirect("user?email=" + user.getEmail());
            }
            else {
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
                rd.include(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("user") != null){
            resp.sendRedirect("welcome.jsp");
        }else
            req.getRequestDispatcher("login.jsp").forward(req, resp);
    }
}
