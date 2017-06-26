<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="WeightCalculator"/>
</c:import>

<div class="main-content">
<c:set var="planet" value="${calculator.planets.get(param.planetName)}" />
<c:url var="imgUrl" value="/img/${planet.imageName}" />
<img class="planetImage" src="${imgUrl}" />

<h1>If you are <c:out value="${calculator.earthWeight}" /> lbs on planet Earth, you would weigh <c:out value="${calculator.alienWeight}" /> lbs on <c:out value="${planet.planetName}" />.</h1>
</div>



<c:import url="/WEB-INF/jsp/common/footer.jsp" />