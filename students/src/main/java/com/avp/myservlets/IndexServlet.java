package com.avp.myservlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class IndexServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        " <meta charset=\"UTF-8\">\n" +
                        " <title>Timer Index</title>\n" +
                        "</head>\n" +
                        "<body align=\"center\">\n" +
                        "<h1> time is passing </h1>\n" +
                        "<a href=\"/school/students\">all students</a> | <a href=\"/school/students/add\">add student</a>\n" +
                        "</body>\n" +
                        "</html>");
    }
}
