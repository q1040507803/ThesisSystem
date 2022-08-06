<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <%--BootStrap美化界面--%>
    <link  rel="stylesheet" href="../bootstrap/css/bootstrap.min.css"/>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        body {
            height: 100%;
            width: 100%;
            overflow: hidden;
            margin: 0;
            padding: 0;
            background-repeat: no-repeat;
            background-size: 100% 100%;
            -moz-background-size: 100% 100%;
            background-color: #8EC5FC;
            background-image: linear-gradient(62deg, #8EC5FC 0%, #E0C3FC 100%);
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100%;

        }

        #loginDiv {
            width: 37%;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 380px;
            background-color: white;
            border-radius: 5px;
        }

        p {
            margin-top: 30px;
            margin-left: 20px;
        }


        #remember{
            margin-left: 15px;
            border-radius: 5px;
            border-style: hidden;
            outline: none;
            padding-left: 10px;
            height: 20px;
            width: 20px;
        }
        #username{
            width: 200px;
            margin-left: 15px;
            border-radius: 5px;
            height: 30px;
            padding-left: 10px;
        }
        #password{
            width: 202px;
            margin-left: 15px;
            border-radius: 5px;
            height: 30px;
            padding-left: 10px;
        }
        .button {
            border-color: cornsilk;
            background-color: rgba(100, 149, 237, .7);
            color: aliceblue;
            border-style: hidden;
            border-radius: 5px;
            width: 100px;
            height: 31px;
            font-size: 16px;
        }

        #subDiv {
            text-align: center;
            margin-top: 30px;
        }
        #loginMsg{
            text-align: center;
        }
    </style>
</head>
<body>
<div id="loginDiv" style="height: 350px">
    <form action="${pageContext.request.contextPath}/thesis/login" method="post">
        <h1 id="loginMsg">请登录系统</h1>
        <span style="color: red;font-weight: bold">${error}</span>
        <p>Username:
            <input id="username" type="text" class="form-control" name="uid" required>
            <div id="username_err" class="err_msg" style="color: red;font-weight: bold;display: none">格式错误</div>
        </p>

        <p>Password:
            <input id="password" type="password" class="form-control" name="password" required>
            <div id="password_err" class="err_msg" style="color: red;font-weight: bold;display: none">格式错误</div>
        </p>

        <p>Remember:<input id="remember" type="checkbox"></p>
        <div id="subDiv">
            <input type="submit" class="button" value="login up">
            <input type="reset" class="button" value="reset">&nbsp;&nbsp;&nbsp;
        </div>
    </form>
</div>

<script>
    var usernameInput=document.getElementById("username");
    usernameInput.onblur=checkusername;
    function checkusername()
    {
        var username=usernameInput.value.trim();
        var flag=username.length >=5 &&username.length <=12
        if (flag){
            document.getElementById("username_err").style.display="none";
        }else {
            document.getElementById("username_err").style.display="";
        }
        return flag;
    }

    var passwordInput=document.getElementById("password");
    passwordInput.onblur=checkpassword;
    function checkpassword()
    {
        var password=passwordInput.value.trim();
        var flag=password.length >=6 &&password.length <=12
        if (flag){
            document.getElementById("password_err").style.display="none";
        }else {
            document.getElementById("password_err").style.display="";
        }
        return flag;
    }

</script>

</body>
</html>
