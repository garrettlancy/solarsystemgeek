<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="main-content">
	<div class="title">Solar System Geek Gift Shop</div>
	<c:forEach var="product" items="${productList}">
		<c:url value="/shoppingCart/detail/${product.id}" var="productLink" />
		<c:url value="/img/${product.imageName}" var="productImage" />
		<div class="product">
			<div class="imageBox">
			<a href="${productLink}"><img class="productImage" src="${productImage}" /></a>
			</div>
			<div class="informationBox">
			<a href="${productLink}"><c:out value="${product.name}" /></a><br>
			<span class="price"><c:out value="${product.price}" /></span><br>
			</div>
		</div>
	</c:forEach>
</div>
<c:import url="/WEB-INF/jsp/common/footer.jsp" />