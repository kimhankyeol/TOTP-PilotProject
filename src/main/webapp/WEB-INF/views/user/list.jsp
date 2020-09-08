<%@ page import="com.totp.project.model.entity.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: kimhankyeol
  Date: 2020-09-08
  Time: 오후 8:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% List<User> uList = (List<User>)request.getAttribute("uList"); %>
<html>
<head>
    <title>유저목록</title>
</head>
<body>
<table>
    <tr>
        <td>아이디</td>
        <td>이름</td>
        <td>이메일</td>
        <td>전화번호</td>
    </tr>
    <% for(int i=0 ;i<uList.size(); i++) {%>
    <tr>
        <td><%=uList.get(i).getId()%></td>
        <td><%=uList.get(i).getEmail()%></td>
        <td><%=uList.get(i).getEmail()%></td>
        <td><%=uList.get(i).getPhoneNumber()%></td>
    </tr>
    <%}%>
</table>
</body>
</html>
