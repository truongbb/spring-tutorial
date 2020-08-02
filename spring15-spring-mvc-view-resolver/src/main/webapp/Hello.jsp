<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Hello World Spring MVC</title>
</head>
<body>
<h2>Hello ${message}</h2>
<form:form action="./about" method="GET">
  <button type="submit">About page</button>
</form:form>

<form:form action="./hello/redirect" method="GET">
  <button type="submit">Final page</button>
</form:form>
</body>
</html>
