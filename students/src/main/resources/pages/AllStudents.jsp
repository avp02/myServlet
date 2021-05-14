<%@ page import="com.avp.bean.Student" %>
<!DOCTYPE html>
<html lang=en>
<head>
 <meta charset=UTF-8>
 <title>timer</title>
</head>
<body align=center>
<h1> time is passing. people changed </h1>
<table align=center>
 <tr>
     <th>id</th>
     <th>name</th>
     <th>lastName</th>
     <th>email</th>
     <th>age</th>
     </tr>

    <%
        for (Student s : Student.total) {
            out.println(
                    " <tr>\n" +
                            " <td>" + s.getId() + "</td>\n" +
                            " <td><a href=\"/school/student?id="  + s.getId() + "\">" + s.getName() + "</a></td>\n" +
                            " <td>" + s.getLastName() + "</td>\n" +
                            " <td>" + s.getAge() + "</td>\n" +
                            " </tr>\n");
        }

    %>

     <tr>
     <th>id</th>
     <th>name</th>
     <th>lastName</th>
     <th>email</th>
     <th>age</th>
     </tr>
    </table>
</body>
</html>