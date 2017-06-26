<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="main-content">
		<div class="title">Solar System Geek Gift Shop</div>
		<div class="productDetail">
			<c:url value="/img/${product.imageName}" var="productImage" />
			<img class="productImage" src="${productImage}" />
			<h1><c:out value="${product.name}" /></h1>
			<span class="price"><c:out value="${product.price}" /></span><br>
			<c:out value="${product.description}" /><br>
			<c:url var="formAction" value="/shoppingCart/detail/added" />
			<form method="POST" action="${formAction}">
			<div class="form">
				<input type="hidden" name="productId" value="${product.id}" />
				<label for="quantity">Quantity to buy: </label>
				<input type="text" name="quantity"/> <input class="button" type="submit" value="Add to Cart" />
			</div>
			</form>
</div>

<c:import url="/WEB-INF/jsp/common/footer.jsp" />