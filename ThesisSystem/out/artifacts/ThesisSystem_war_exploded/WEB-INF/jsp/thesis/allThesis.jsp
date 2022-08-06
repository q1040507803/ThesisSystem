<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>论文展示</title>
    <%--BootStrap美化界面--%>
    <link  rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"/>
</head>
<body>
<div class="col-md-12 column">
    <div class="navbar navbar-inverse navbar-static-top">
        <div class="collapse navbar-collapse" id="ThesisMeun">
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">论文信息</a></li>
                <li ><a href="/student/allStudent" >学生信息</a></li>
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
                <a  class="btn btn-primary" href="${pageContext.request.contextPath}/thesis/toAddThesis">新增论文</a>
                <a  class="btn btn-primary" href="${pageContext.request.contextPath}/thesis/allThesis">显示全部论文</a>
            </div>
            <div class="col-md-4 column"></div>
            <div class="col-md-4 column">
                <form  class="form-inline" action="${pageContext.request.contextPath}/thesis/queryThesis" method="post" style="float: right">
                    <span style="color: red;font-weight: bold">${error}</span>
                    <input type="text" name="qureyThesisName" class="form-control" placeholder="请输入要查询论文的名称">
                    <input type="submit" value="查询" class="btn btn-primary">
                </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>论文编号</th>
                    <th>学生名称</th>
                    <th>论文名称</th>
                    <th>导师名称</th>
                    <th>所属学院</th>
                    <th>操作</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="thesis" items="${list}">
                    <tr>
                        <td>${thesis.thid}</td>
                        <td>${thesis.student.sname}</td>
                        <td>${thesis.thname}</td>
                        <td>${thesis.teacher.tname}</td>
                        <td>${thesis.college.cname}</td>

                        <td>
                            <a  href="${pageContext.request.contextPath}/thesis/toUpdate?id=${thesis.thid}">修改</a>
                            &nbsp; | &nbsp;
                            <a href="${pageContext.request.contextPath}/thesis/deleteThesis/${thesis.thid}">删除</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

</body>

</html>
