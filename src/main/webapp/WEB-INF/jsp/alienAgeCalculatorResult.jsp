<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="AgeCalculator"/>
</c:import>

<div class="main-content">
<c:set var="planet" value="${calculator.planets.get(param.planetName)}" />
<c:url var="imgUrl" value="/img/${planet.imageName}" />
<img class="planetImage" src="${imgUrl}" />

<c:choose>
	<c:when test="${calculator.alienAge < 1}">
		<h1>If you are <c:out value="${calculator.earthAge}" /> years old on planet Earth, you are less than 1 years old on <c:out value="${planet.planetName}" />.</h1>
	</c:when>
	<c:otherwise>
		<h1>If you are <c:out value="${calculator.earthAge}" /> years old on planet Earth, you are <fmt:formatNumber value="${calculator.alienAge}" maxFractionDigits="2" /> years old on <c:out value="${planet.planetName}" />.</h1>
	</c:otherwise>
</c:choose>
</div>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />