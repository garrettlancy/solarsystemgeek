<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="TravelCalculator"/>
</c:import>

<div class="main-content">
<c:set var="planet" value="${calculator.planets.get(param.planetName)}" />
<c:url var="imgUrl" value="/img/${planet.imageName}" />
<img class="planetImage" src="${imgUrl}" />

<h1>Traveling by <c:out value="${calculator.transportation}" /> you will reach <c:out value="${planet.planetName}" /> in <fmt:formatNumber value="${calculator.alienDistanceYears}" maxFractionDigits="2" /> years. You will be <fmt:formatNumber value="${calculator.alienDistanceAge}" maxFractionDigits="2" /> years old.</h1>
</div>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />