/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

package controllers;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import business.customerInfo;
import java.time.*;
import java.time.format.DateTimeFormatter;


public class RespondServlet extends HttpServlet {
    @Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       String url = "MurachSurvey/index.html";
       String action = request.getParameter("action");
       if (action == null){
           action = "join";
       }
       if (action.equals("join")) {
           url = "MurachSurvey/index.html";
       }
       else if (action.equals("add")){
           String firstName = request.getParameter("firstName");
           String lastName = request.getParameter("lastName");
           String email = request.getParameter("email");
           String birthStr = request.getParameter("birth");
           String like = request.getParameter("like");
           String contact = request.getParameter("contact");
           String method = request.getParameter("contactby");
           String respond = null;
           // xu ly birth day 
           LocalDate birthDay = LocalDate.parse(birthStr);
           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
           String formatBirthDay = birthDay.format(formatter);
           // het xu ly birth day
           
           // xu ly phuong thuc lien lac 
           if (like != null || contact != null){
               respond = "Thanks for your interest, we will be in touch with you by " + method;
           }
           // het xu ly phuong thuc lien lac 
           
           // xu ly nghe qua dau
           String heared = request.getParameter("heared");
           // het xu ly nghe qua dau
           
           customerInfo info = new customerInfo (firstName,lastName,email,formatBirthDay,like,contact,respond,heared);
           request.setAttribute("customerInfo", info);
           url = "/MurachSurvey/respond.jsp";
       }
       getServletContext()
               .getRequestDispatcher(url)
               .forward(request,response);
    } 
     @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response)
                         throws ServletException, IOException {
        doPost(request, response);
    }

}
