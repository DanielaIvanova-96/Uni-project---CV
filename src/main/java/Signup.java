import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@WebServlet("/Signup")
public class Signup extends HttpServlet {

    public static UsersList userList = new UsersList();

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");

        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String pass_r = request.getParameter("pass_r");

        if(pass.equals(pass_r)) {

            LoginServlet.readxml();

            //userList.setList(new ArrayList<User>());
            User u = new User(email, pass);
            userList.getList().add(u);

            try {
                JAXBContext context = JAXBContext.newInstance(UsersList.class);
                Marshaller marshaller = context.createMarshaller();

                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
                marshaller.marshal(userList, new File("C:\\Users\\Danny\\Java projects\\it_lab5\\src\\main\\webapp\\users.xml"));
            } catch (JAXBException e) {
                e.printStackTrace();
            }


            response.sendRedirect("menu");
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(req.getSession().getAttribute("user") != null){
            resp.sendRedirect("welcome.jsp");
        }else
            req.getRequestDispatcher("signup.jsp").forward(req, resp);

    }
}
