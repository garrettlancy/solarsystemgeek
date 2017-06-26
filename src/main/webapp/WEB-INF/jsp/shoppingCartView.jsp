<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<c:import url="/WEB-INF/jsp/common/header.jsp" />

<div class="main-content">
	<div class="title">Solar System Geek Gift Shop</div>
	<div class="table">
	<table>
		<tr>
			<th id="cart"></th>
			<th id="cart">Name</th>
			<th id="cart">Price</th>
			<th id="cart">Qty.</th>
			<th id="cart">Total</th>
		</tr>
		<c:set var="keyList" value="${shoppingCart.contents.keySet()}" />
		<c:set var="total" value=""/>
		<c:forEach var="product" items="${keyList}">
			<c:url value="/img/${product.imageName}"  var="productImage"/>
			<tr>
				<td><img class="tableImage" src="${productImage}" /></td>
				<td id="cart"><c:out value="${product.name}" /></td>
				<td id="cart">$<c:out value="${product.price}" /></td>
				<td id="cart"><c:out value="${shoppingCart.contents.get(product)}" /></td>
				<td id="cart">$<c:out value="${shoppingCart.contents.get(product) * product.price}"/></td>
			</tr>
			<c:set var="total" value="${shoppingCart.contents.get(product) * product.price + total}" />
		</c:forEach>
	</table>
	</div>
	<div class="total">
		Grand Total: $<c:out value="${total}" /><br>
		<c:url var="thankYou" value="/shoppingCart/thankYou" />
		<a href="${thankYou}">Check Out</a>
	</div>



</div>


<c:import url="/WEB-INF/jsp/common/footer.jsp" />