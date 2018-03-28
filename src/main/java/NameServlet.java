import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Name", urlPatterns = "/name")
public class NameServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        request.getParameter("UserName");
        response.sendRedirect("/name.jsp");
//
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        request.setAttribute("UserName", request.getAttribute("UserName"));
        request.getRequestDispatcher("/surprise.jsp").forward(request, response);

//        String UserName = "World";
//
//        if (request.getMethod().equalsIgnoreCase("post")) {
//            UserName = request.getParameter("UserName");
////            response.sendRedirect("/surprise.jsp");
//            response.getWriter().println("Hello, " + UserName);
//        }
    }
}
