<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学院列表</title>
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
                <li ><a href="/teacher/allTeacher" >导师信息</a></li>
                <li class="active"><a href="#" >学院信息</a></li>
            </ul>
        </div>
    </div>
</div>

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>学院编号</th>
                    <th>学院名称</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="college" items="${list}">
                    <tr>
                        <td>${college.cid}</td>
                        <td>${college.cname}</td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>


</div>

</body>

</html>
