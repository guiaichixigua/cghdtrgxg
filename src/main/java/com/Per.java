package com;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Per extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String vegetable = request.getParameter("vegetable");
        if (vegetable == null){
            vegetable = "Tomcat";
        }
        writer.println("<html><body><h1>jump with");
        writer.println(vegetable);
        writer.println("</h1></body></html>");
    }
}
