package com.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/hello")
public class MyServlet extends HttpServlet {
    private static final  long serialVersionUID=1L ;
    public MyServlet(){
        super();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPost(request, response);
        response.setContentType("text/jsp");
        String user = request.getParameter("user") ;
        String password = request.getParameter("pass") ;
        PrintWriter out ;
        try {
            out = response.getWriter();
            out.println("<%@ page contentType=\"text/html;charset=UTF-8\" language=\"java\" %>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "    <title>Title</title>\n" +
                    "</head>\n" +
                    "<body>");
            out.println("Merci " + user);
            out.println("vous etes maintenent enregostrez !!");
            out.println("</body>\n" +
                    "</html>");
            out.close();


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}