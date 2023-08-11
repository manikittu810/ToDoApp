<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link href="\webjars\bootstrap\5.1.3\css\bootstrap.min.css" rel="stylesheet">
    <title>List ToDo's page</title>
</head>
<body>
<div class="container">
    <div>Your ToDo's are :</div>
    <table class="table">
        <thead>
        <tr>
            <th>id</th>
            <th>Description</th>
            <th>TargetDate</th>
            <th>Is Done?</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${todos}" var="todo">
            <tr>
                <td>${todo.id}</td>
                <td>${todo.description}</td>
                <td>${todo.targetDate}</td>
                <td>${todo.done}</td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
    <a href="add-todo" class="btn btn-success">Add ToDo</a>
</div>
    <script src="\webjars\bootstrap\5.1.3\js\bootstrap.min.js"></script>
    <script src="\webjars\jquery\3.6.0\jquery.min.js"></script>
</body>
</html>