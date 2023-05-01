<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
 
		<h1>Edit Movie</h1>
       <form:form method="post" action="editsave">  
      	<table >  
      	<tr>
      	<td></td>  
         <td><form:hidden  path="id" /></td>
         </tr> 
         <tr>  
          <td>Movie Name : </td> 
          <td><form:input path="name"  /></td>
         </tr>  
         <tr>  
          <td>Ticket Price:</td>  
          <td><form:input path="salary" /></td>
         </tr> 
         <tr>  
          <td>Rating :</td>  
          <td><form:input path="designation" /></td>
         </tr> 
         
         <tr>  
          <td> </td>  
          <td><input type="submit" value="Edit Save" /></td>  
         </tr>  
        </table>  
       </form:form>  
<!--
<head><link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous"></head>
<nav class="navbar bg-dark" data-bs-theme="dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">RESTO RESTAURANT</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    
  </div>
  </nav> 
	
  <div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">CUSTOMER NAME</label>
  <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Enter Customer Name">
  </div>
  <div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">CUSTOMER ID</label>
  <input type="text" class="form-control" id="formGroupExampleInput" placeholder="ENter Customer ID">
  </div>
  <div class="mb-3">
  <label for="formGroupExampleInput" class="form-label">MEAL TYPE</label>
  <input type="text" class="form-control" id="formGroupExampleInput" placeholder="Enter Meal type">
</div>
-->