<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="WeightCalculator"/>
</c:import>

<div class="main-content">
<div class="title">Solar System Geek Forum</div><br>
<c:url value="/spaceForumInput" var="spaceForumInput"/>
<div class="post"><a href="${spaceForumInput}">Post a Message</a></div>
<c:forEach var="post" items="${posts}">
<c:choose>
<c:when test="${post.id % 2 == 1}">
	<c:set var="number" value="odd"/>
</c:when>
<c:otherwise>
	<c:set var="number" value="even" />
</c:otherwise>
</c:choose>
	<div class="forumPost" id="${number}">
		<h1><c:out value="${post.subject}" /></h1>
		by <c:out value="${post.username}" /> on <fmt:formatDate value="${post.datePosted}" pattern="M/d/yyyy 'at' H:mm:ss" /><br>
		<c:out value="${post.message}" />
	</div>
</c:forEach>
</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />