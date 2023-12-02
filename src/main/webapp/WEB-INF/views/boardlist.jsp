<%--
  Created by IntelliJ IDEA.
  User: sanghyunlee
  Date: 12/1/23
  Time: 10:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<% taglib prefix="c" page="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
          integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N"
          crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
            crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>
<div class="container">
    <div class="py-5 text-center">
        <h2>Board List</h2>
        <p class="lead">Below is the list of boards dynamically generated from the server.</p>
    </div>
    <div class="table-responsive">
        <table class="table table-striped table-sm">
            <thead>
            <tr>
                <th>#</th>
                <th>Board Name</th>
                <th>Category</th>
                <th>Number of People</th>
                <th>Meeting Day</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="board" items="${list}">
                <tr>
                    <td>${board.id}</td>
                    <td>${board.Rname}</td>
                    <td>${board.Kind}</td>
                    <td>${board.People}</td>
                    <td>${board.Meetday}</td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
