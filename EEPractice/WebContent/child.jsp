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
<title>Insert title here</title>

</head>
<body>
<s:errors></s:errors>
<h1>${actionBean.name}</h1>
<s:form beanclass="com.actionclasses.LoginActionBean">
<s:text name="name" class="required"></s:text>
<s:submit name="checkLogin" value="Check"/>


</s:form>

</body>
</html>