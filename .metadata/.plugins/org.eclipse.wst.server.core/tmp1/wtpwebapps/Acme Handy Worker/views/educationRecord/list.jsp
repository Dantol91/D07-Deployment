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



<display:table name="educationRecords" id="educationRecord"
	requestURI="educationRecord/handyWorker/list.do" pagesize="5"
	class="displaytag">

	<security:authorize access="hasRole('HANDYWORKER')">

		<display:column>
			<a
				href="educationRecord/handyWorker/edit.do?educationRecordId=${educationRecord.id}"><spring:message
					code="educationRecord.edit"></spring:message></a>
		</display:column>

		<display:column>
			<a
				href="educationRecord/handyWorker/display.do?educationRecordId=${educationRecord.id}"><spring:message
					code="educationRecord.display"></spring:message></a>
		</display:column>

		<spring:message code="educationRecord.diplomaTitle"
			var="educationRecordDiplomaTitle"></spring:message>
		<display:column property="diplomaTitle"
			title="${educationRecordDiplomaTitle}" sortable="false" />

		<spring:message code="educationRecord.startDate" var="startDate"></spring:message>
		<display:column property="start" title="${startDate}" sortable="false" />

		<spring:message code="educationRecord.endDate" var="endDate"></spring:message>
		<display:column property="end" title="${endDate}" sortable="false" />


		<spring:message code="educationRecord.institution" var="institution"></spring:message>
		<display:column property="institution" title="${institution}"
			sortable="false" />

		<spring:message code="educationRecord.attachment" var="attachment"></spring:message>
		<display:column property="attachment" title="${attachment}"
			sortable="false" />

		<spring:message code="educationRecord.comments" var="comments"></spring:message>
		<display:column property="comments" title="${comments}"
			sortable="false" />

	</security:authorize>
</display:table>

<security:authorize access="hasRole('HANDYWORKER')">

	<input type="button" name="create"
		value="<spring:message code="educationRecord.create"></spring:message>"
		onclick="javascript:relativeRedir('educationRecord/handyWorker/create.do')" />
</security:authorize>

<security:authorize access="hasRole('HANDYWORKER')">

	<input type="button" name="back"
		value="<spring:message code="educationRecord.back"></spring:message>"
		onclick="javascript:relativeRedir('curriculum/handyWorker/display.do')" />
</security:authorize>
