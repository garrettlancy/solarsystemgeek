<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="WeightCalculator"/>
</c:import>

<div class="main-content">
<div class="title">Alien Weight Calculator</div>

<c:url var="formAction" value="/alienWeightCalculatorResult" />
<form method="GET" action="${formAction}">
<div class="form">
	<label for="planetName">Choose a planet:</label>
	<select name="planetName" id="planetName">
	<c:set var="keyList" value="${planets.keySet()}" />
		<c:forEach var="key" items="${keyList}">
			<option value="${key}"><c:out value="${key}" /></option>
		</c:forEach>
	</select>
</div>
<div class="form">
	<label for="earthWeight" id="earthWeight">Enter your Earth weight:</label>
	<input type="text" name="earthWeight" id="earthWeight" />
</div>
<div class="form">
	<input class="button" type="submit" value="Calculate Weight" />
</div>
</form>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />