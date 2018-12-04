<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="sp" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>New User</title>
</head>
<body>
<sp:form method="post" modelAttribute="user">
    <sp:input path="id"></sp:input>
    <sp:input path="name"></sp:input>
    <sp:input path="age"></sp:input>
    <button type="submit">OK</button>
</sp:form>
</body>
</html>
