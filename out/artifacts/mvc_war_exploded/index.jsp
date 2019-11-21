<%--
  Created by IntelliJ IDEA.
  User: wanghe
  Date: 2019/11/15
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>title</title>
  </head>
  <body>
    <form action="${pageContext.request.contextPath}/page.form" modelAttribute="userForm" method="post">
        <ul>
            <li>姓名：<label><input type="text" name="username" /></label></li>
            <li>学校：<label><input type="text" name="school" /></label></li>
            <li><input type="submit" value="提交" /></li>
        </ul>
    </form>
  </body>
</html>
