<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:label for="Login"></s:label>
<s:errors></s:errors>
<s:form beanclass="com.actionclasses.LoginActionBean">

<table>
<tbody>
<tr>
<td><s:label for="user.username"/></td>
<td><s:text name="user.username"/></td>
</tr>
<tr>
<td><s:label for="user.password"/></td>
<td><s:text name="user.password"/></td>
</tr>
<tr>
<td><s:submit name="checkLogin" value="Login"></s:submit></td>
<td><s:link beanclass="com.actionclasses.RegisterActionBean">Register</s:link></td>
</tr>
</tbody>
</table>
</s:form>
<s:layout-render name="/footer.jsp"></s:layout-render>
</body>
</html>