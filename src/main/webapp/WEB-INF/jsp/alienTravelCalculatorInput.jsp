<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="TravelCalculator"/>
</c:import>

<div class="main-content">
<div class="title">Alien Travel Calculator</div>

<c:url var="formAction" value="/alienTravelCalculatorResult" />
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
	<label for="transportation">Choose a mode of transportation:</label>
	<select name="transportation" id="transportation">
		<option value="Boeing 747">Boeing 747</option>
		<option value="Walking">Walking</option>
		<option value="Car">Car</option>
		<option value="Bullet Train">Bullet Train</option>
		<option value="Concorde">Concorde</option>
	</select>
</div>
<div class="form">
	<label for="earthAge" id="earthAge">Enter your Earth age:</label>
	<input type="text" name="earthAge" id="earthAge" />
</div>
<div class="form">
	<input class="button" type="submit" value="Calculate Travel" />
</div>
</form>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />