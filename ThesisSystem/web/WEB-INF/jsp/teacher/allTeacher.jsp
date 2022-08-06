<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>导师列表</title>
    <%--BootStrap美化界面--%>
    <link  rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"/>
</head>
<body>

<div class="col-md-12 column">
    <div class="navbar navbar-inverse navbar-static-top">
        <div class="collapse navbar-collapse" id="teacherMeun">
            <ul class="nav navbar-nav">
                <li ><a href="/thesis/allThesis">论文信息</a></li>
                <li ><a href="/student/allStudent" >学生信息</a></li>
                <li class="active"><a href="#" >导师信息</a></li>
                <li ><a href="/college/allCollege" >学院信息</a></li>

            </ul>
        </div>
    </div>
</div>
<div class="container">
    <div class="row clearfix">
        <div class="row">
            <div class="col-md-4 column">
                <a  class="btn btn-primary" href="${pageContext.request.contextPath}/teacher/toAddTeacher">新增/修改导师</a>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>导师编号</th>
                    <th>导师名称</th>
                    <th>所属学院</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="teacher" items="${teachers}">
                    <tr>
                        <td>${teacher.tid}</td>
                        <td>${teacher.tname}</td>
                        <td>${teacher.cname}</td>
                        <td> <a href="${pageContext.request.contextPath}/teacher/deleteTeacher/${teacher.tid}">删除</a></td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>


</div>

</body>

</html>
