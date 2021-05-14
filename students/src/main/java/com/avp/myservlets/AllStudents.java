package com.avp.myservlets;

import com.avp.bean.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AllStudents extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("studentList", Student.total);
        req.setAttribute("studentsTotal", Student.total.size());

        RequestDispatcher view = req.getRequestDispatcher("AllStudents.jsp");

        view.forward(req, resp);
    }
}
