<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增/修改导师</title>
    <%--BootStrap美化界面--%>
    <link  rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增/修改导师</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/teacher/addTeacher" method="post">
        <div class="form-group">
            <label>导师id：</label>
            <input type="text" name="tid" class="form-control" required>
        </div>
        <div class="form-group">
            <label>导师名字：</label>
            <input type="text" name="tname" class="form-control" required>
        </div>
        <div class="form-group">
            <label>所属学院：</label>
            <select name="cname">
                <c:forEach var="college" items="${colleges}">
                    <option value="${college.cname}">${college.cname}</option>
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