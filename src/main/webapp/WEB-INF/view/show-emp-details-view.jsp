<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h2> Dear User, you are WELCOME!</h2>

<br>
<br>
<br>

<%--Your name: ${param.pidorName}--%>
Your name: ${employee.name}
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your car: ${employee.carBrend}
<br>
Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li> ${lang} </li>

    </c:forEach>

</ul>

Phone number:${employee.phoneNumber}
<br>
Email:${employee.email}


</body>

</html>