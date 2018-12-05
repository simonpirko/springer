<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>New User</title>
</head>
<body>
<sp:form method="post" modelAttribute="user">
    <sp:input path="id"/>
    <br>
    <sp:input path="name"/>
    <br>
    <sp:input path="age"/>
    <br>
    <sp:errors path="name" cssStyle="color: red;"/>
    <br>
    <sp:button>OK</sp:button>
</sp:form>
</body>
</html>
