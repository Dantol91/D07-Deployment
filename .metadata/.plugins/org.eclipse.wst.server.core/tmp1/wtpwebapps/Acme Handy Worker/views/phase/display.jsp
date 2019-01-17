<%--
 * action-1.jsp
 *
 * Copyright (C) 2018 Universidad de Sevilla
 * 
 * The use of this project is hereby constrained to the conditions of the 
 * TDG Licence, a copy of which you may download from 
 * http://www.tdg-seville.info/License.html
 --%>

<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@taglib prefix="display" uri="http://displaytag.sf.net"%>




<security:authorize access="hasRole('ADMIN')">
	<spring:message code="category.name"></spring:message>:
	<jstl:out value="${category.name}"></jstl:out>
	<br />


	<spring:message code="category.parentCategory"></spring:message>:
	<a href="category/administrator/display.do?categoryId=${category.parentCategory.id}"><jstl:out value="${category.parentCategory.name}"></jstl:out></a>
	<br />

	<br />

</security:authorize>

<security:authorize access="hasRole('ADMIN')">
		
	<spring:message code="category.edit" var="edit"></spring:message>
	<input type="button" name="edit" value="${edit}" onclick="javascript:relativeRedir('category/administrator/edit.do?categoryId=${category.id}')" />
	
		<spring:message code="category.delete" var="delete"></spring:message>
	<input type="button" name="delete" value="${delete}" onclick="javascript:relativeRedir('category/administrator/delete.do?categoryId=${category.id}')" />
	
	<button type="button" onclick="javascript: relativeRedir('category/administrator/list.do')" ><spring:message code="category.return" />
	</button>

		
</security:authorize>

