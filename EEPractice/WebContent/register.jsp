<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="s" uri="http://stripes.sourceforge.net/stripes.tld" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<s:layout-render name="/layoutrender.jsp"></s:layout-render>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<s:label for="Register"></s:label>
<s:errors></s:errors>
<s:form beanclass="com.actionclasses.RegisterActionBean">
<table>
<tbody>
<tr>
<td><s:label for="user.firstName"/></td>
<td><s:text name="user.firstName"/></td>
</tr>
<tr>
<td><s:label for="user.lastName"/></td>
<td><s:text name="user.lastName"/></td>
</tr>
<tr>
<td><s:label for="user.username"/></td>
<td><s:text name="user.username"/></td>
</tr>
<tr>
<td><s:label for="user.password"/></td>
<td><s:password name="user.password"/></td>
</tr>
<tr>
<td><s:label for="confirmPassword"/></td>
<td><s:password name="confirmPassword"/></td>
</tr>
<tr>
<td><s:submit name="registerUser" value="Register"></s:submit></td>
</tr>
</tbody>
</table>

</s:form>
<s:layout-render name="/footer.jsp"></s:layout-render>
</body>
</html>