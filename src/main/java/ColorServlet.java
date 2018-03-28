import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Color", urlPatterns = "/pickcolor")
public class ColorServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//        request.getParameter("UserName");
        response.sendRedirect("/pickcolor.jsp");
//
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        request.setAttribute("color", request.getAttribute("color"));
        request.getRequestDispatcher("/color.jsp").forward(request, response);

//        String UserName = "World";
//
//        if (request.getMethod().equalsIgnoreCase("post")) {
//            UserName = request.getParameter("UserName");
////            response.sendRedirect("/surprise.jsp");
//            response.getWriter().println("Hello, " + UserName);
//        }
    }
}
