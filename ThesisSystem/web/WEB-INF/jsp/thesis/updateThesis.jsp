<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>新增书籍</title>
    <%--BootStrap美化界面--%>
    <link  rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">

    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>新增书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/thesis/updateThesis" method="post">

        <input type="hidden" name="thid" value="${QThesis.thid}">
        <div class="form-group">
            <label>学生id：</label>
            <input type="text" name="student.sid" class="form-control" value="${QThesis.student.sid}" required>
        </div>
        <div class="form-group">
            <label>学生名字：</label>
            <input type="text" name="student.sname" class="form-control" value="${QThesis.student.sname}" required>
        </div>

        <div class="form-group">
            <label>论文名字：</label>
            <input type="text" name="thname" class="form-control" value="${QThesis.thname}" required>
        </div>

        <div class="form-group">
            <label>导师名字：</label>
            <select name="teacher.tname">
                <option value="${teacher.tname}">${QThesis.teacher.tname}</option>
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