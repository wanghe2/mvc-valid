
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
</head>
<body>
<br/><br/><br/><br/>
<h1>欢迎来到新页面</h1>
<br/><br/><br/><br/>
<a href="${pageContext.request.contextPath}/languageChange.form?new&locale=zh_CN">中英文切换页面</a>
</body>
</html>