package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/ads/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO: show the registration form
        request.getRequestDispatcher("/WEB-INF/ads/register.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // TODO: ensure the submitted information is valid
        // TODO: create a new user based off of the submitted information
        // TODO: if a user was successfully created, send them to their profile
//        User user = new User(
//                request.getParameter("username"),
//                request.getParameter("email"),
//                request.getParameter("password")
//        );
//        if (user.getUsername().length() < 150 && user.getEmail().length() < 150 && user.getPassword().length() < 150) {
//        DaoFactory.getUsersDao().insert(user);
//            response.sendRedirect("/profile");
//        } else {
//            System.out.println("Please Enter Valid Information");
//        }



        if(DaoFactory.getUsersDao().findByUsername(request.getParameter("username")) ==null){
            User newUser = new User(
                    request.getParameter("username"),
                    request.getParameter("email"),
                    request.getParameter("password")
            );
            DaoFactory.getUsersDao().insert(newUser);
            HttpSession session = request.getSession();
            session.setAttribute("user", newUser);
            response.sendRedirect("/profile");
        }else {
            response.sendRedirect("/register");
        }


    }
}
