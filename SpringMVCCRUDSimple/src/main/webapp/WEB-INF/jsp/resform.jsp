<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

		<h1>Add New Reservation</h1>
       <form:form method="post" action="save">  
      	<table >  
         <tr>  
          <td>Customer Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Customer ID:</td>  
          <td><form:input path="custID" /></td>
         </tr> 
         <tr>  
          <td>Meal Type:</td>  
          <td><form:input path="mealType" /></td>
         </tr> 
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
