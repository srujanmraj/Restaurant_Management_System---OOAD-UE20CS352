    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

	<h1>Reservations List</h1>
	<table border="2" width="70%" cellpadding="2">
	<tr><th>Reservation Id</th><th>Customer Name</th><th>Customer ID</th><th>Meal Type</th><th>Delete</th></tr>
    <c:forEach var="reservation" items="${list}"> 
    <tr>
    <td>${reservation.id}</td>
    <td>${reservation.name}</td>
    <td>${reservation.custID}</td>
    <td>${reservation.mealType}</td>
    <td><a href="deleteres/${reservation.id}">Delete</a></td>
    </tr>
    </c:forEach>
    </table>
    <br/>
    <a href="resform">Add New Reservation</a>