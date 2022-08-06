<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
    <%--BootStrap美化界面--%>
    <link  rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"/>
</head>
<body>

<div class="col-md-12 column">
    <div class="navbar navbar-inverse navbar-static-top">
        <div class="collapse navbar-collapse" id="teacherMeun">
            <ul class="nav navbar-nav">
                <li ><a href="/thesis/allThesis">论文信息</a></li>
                <li class="active"><a href="#" >学生信息</a></li>
                <li ><a href="/teacher/allTeacher" >导师信息</a></li>
                <li ><a href="/college/allCollege" >学院信息</a></li>
            </ul>
        </div>
    </div>
</div>

<div class="container">
    <div class="row clearfix">
        <div class="row">
            <div class="col-md-4 column">
                <a  class="btn btn-primary" href="${pageContext.request.contextPath}/student/toAddStudent">新增/修改学生</a>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>学生编号</th>
                    <th>学生名称</th>
                    <th>导师名称</th>
                    <th>所属学院</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="student" items="${students}">
                    <tr>
                        <td>${student.sid}</td>
                        <td>${student.sname}</td>
                        <td>${student.tname}</td>
                        <td>${student.cname}</td>
                        <td> <a href="${pageContext.request.contextPath}/student/deleteStudent/${student.sid}">删除</a></td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>


</div>

</body>

</html>
