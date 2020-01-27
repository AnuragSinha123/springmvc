<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<title>Customer Confirmation Form</title>
</head>
<body>
The Customer is confirmed : ${customer.firstName} ${customer.lastName} 

<br><br>

Free Pass : ${customer.freePass} 
</body>
</html>