<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增/修改学生</title>
    <%--BootStrap美化界面--%>
    <link  rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增/修改学生</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/student/addStudent" method="post">
        <div class="form-group">
            <label>学生id：</label>
            <input type="text" name="sid" class="form-control" required>
        </div>
        <div class="form-group">
            <label>学生名字：</label>
            <input type="text" name="sname" class="form-control" required>
        </div>
        <div class="form-group">
            <label>导师名字：</label>
            <select name="tname">
                <c:forEach var="teacher" items="${teachers}">
                    <option value="${teacher.tname}">${teacher.tname}</option>
                </c:forEach>
            </select>
        </div>

        <div class="form-group">
            <input type="submit" class="form-control" value="添加">
        </div>

    </form>

</div>

</body>
</html>