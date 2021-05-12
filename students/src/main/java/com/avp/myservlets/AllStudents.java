package com.avp.myservlets;

import com.avp.bean.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AllStudents extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(Student.total.size()==0) {
            Student.total.add(new Student(0L, "Maksim", "Shelkovich",
                    "my@email", 35));
        }
        PrintWriter out = resp.getWriter();
        out.println("" +
                "<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                " <meta charset=\"UTF-8\">\n" +
                " <title>timer</title>\n" +
                "</head>\n" +
                "<body align=\"center\">\n" +
                "<h1> time is passing. people changed </h1>\n" +
                "<table align=\"center\">\n" +
                " <tr>\n" +
                " <th>id</th>\n" +
                " <th>name</th>\n" +
                " <th>lastName</th>\n" +
                " <th>email</th>\n" +
                " <th>age</th>\n" +
                " </tr>\n");
        for (Student s : Student.total) {
            out.println(
                    " <tr>\n" +
                            " <td>" + s.getId() + "</td>\n" +
                            " <td>" + s.getName() + "</td>\n" +
                            " <td>" + s.getLastName() + "</td>\n" +
                            " <td>" + s.getEmail() + "</td>\n" +
                            " <td>" + s.getAge() + "</td>\n" +
                            " </tr>\n");
        }
        out.println(
                " <tr>\n" +
                " <th>id</th>\n" +
                " <th>name</th>\n" +
                " <th>lastName</th>\n" +
                " <th>email</th>\n" +
                " <th>age</th>\n" +
                " </tr>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>");
    }
}
