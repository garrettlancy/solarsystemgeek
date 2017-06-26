<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<c:import url="/WEB-INF/jsp/common/header.jsp">
	<c:param name="subTitle" value="WeightCalculator"/>
</c:import>

<div class="main-content">

<div class="title">New Geek Post</div>

<c:url var="formAction" value="/spaceForumResult" />
	<form method="POST" action="${formAction}">
		<div class="form">
			<label for="username">Username:</label>
			<input type="text" name="username" id="username"/>
		</div>
		<div class="form">
			<label for="subject">Subject</label>
			<input type="text" name="subject" id="subject"/>
		</div>
		<div class="form">
			<label for="message">Message</label>
			<input type="text" name="message" id="message"/>
		</div>
		<div class="form">
			<input class="button" type="submit" value="Submit!" />
		</div>
	</form>

</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />