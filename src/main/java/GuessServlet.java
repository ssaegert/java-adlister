import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {
        private int randNum = 27;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        request.getRequestDispatcher("/answer.jsp").forward(request, response);
        int number = Integer.parseInt(request.getParameter("number"));




        String answer="";

            if (number < randNum) {
            answer = "<h1>Higher!</h1>";
        } else if (number > randNum) {
                answer = "<h1>Lower!</h1>";
        } else if (number == randNum) {
                answer = "<h1>You Got It!</h1>";
        }
            request.setAttribute("answer", answer);
            request.getRequestDispatcher("answer.jsp").forward(request, response);
//        response.sendRedirect("/answer?num="+number);
//
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("guess.jsp").forward(request, response);
    }
}
