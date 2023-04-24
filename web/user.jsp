<%@ page import="front_controller.model.User" %>
<%@ page import="front_controller.model.FakeDao" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%
    User u1 = new FakeDao().userData();
%>
<html>
<head>
    <title>FrontController</title>
</head>
<body>
<h1>유저</h1>
<hr/>
<h3>번호 : <%=u1.getId()%>
</h3>
<h3>유저명 : <%=u1.getUsername()%>
</h3>
<h3>비밀번호 : <%=u1.getPassword()%>
</h3>
<h3>num : ${num}</h3>
</body>
</html>
