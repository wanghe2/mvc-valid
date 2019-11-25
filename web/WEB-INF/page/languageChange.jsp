
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="mvc" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Title</title>
</head>
<body>
<div>
    <a href="${pageContext.request.contextPath}/languageChange.form?language=zh_CN">中文</a>
    <a href="${pageContext.request.contextPath}/languageChange.form?language=en_US">英文</a>
</div>
<br/><br/><br/><br/>
<h1><spring:message code="country" /></h1>
<h1><spring:message code="home" /></h1>
</body>
</html>