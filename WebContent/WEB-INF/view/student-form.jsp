<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>STUDENT REGISTRATION FORM</title>
</head>
<body> 

  <form:form action= "processForm" modelAttribute = "student">
  
  First Name : <form:input path = "firstName"/>
  
  <br><br>
  
  Last Name : <form:input path = "lastName"/>
  
  <br><br>
  
 

  
  Country :
  
  <form:select path = "country">
  
  <form:options items="${student.countryOptions}" />
  
  <!--  <form:option value="India" label="India"/>
   <form:option value="USA" label="USA"/>
   <form:option value="France" label="France"/>
   <form:option value="Russia" label="Russia"/>
   --> 
  </form:select>
  
  <br><br>
  
  Language :
  
    Java<form:radiobutton path="favouriteLanguage" value ="java"/>
    C<form:radiobutton path="favouriteLanguage" value ="C"/>
    Python<form:radiobutton path="favouriteLanguage" value ="Python"/>
    C#<form:radiobutton path="favouriteLanguage" value ="C#"/>
    
    <br><br>
    
    
   <input type ="submit" value = "Submit"/>
   
     
  <br><br>
  
  </form:form>
  
</body>
</html>