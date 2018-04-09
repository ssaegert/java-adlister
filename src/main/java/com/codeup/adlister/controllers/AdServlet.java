package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AdServlet", urlPatterns = "/ads/ad")
public class AdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/ads/ad.jsp").forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Ad ad = (Ad) request.getSession().getAttribute("title");
//        request.setAttribute("ads", DaoFactory.getAdsDao().single());

//        request.getAttribute("id");
//        request.setAttribute("id", "id");
        request.setAttribute("ads", DaoFactory.getAdsDao().singleAd());
        request.getRequestDispatcher("/WEB-INF/ads/ad.jsp").forward(request, response);
    }
}
