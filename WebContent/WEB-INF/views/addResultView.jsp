<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="./css/result.css">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">

<title>FACE UNIVERSITY</title>
</head>
<body>
		 <nav>
        <ul>
            <li class="logo-text">
             <img src="./assets/face_logo.svg"  alt="logo">
            </li>
             </ul>
            <ul>
                <li><a href= " ${pageContext.request.contextPath }/adminsignup"   class="nav-link">ADMIN SIGN UP</a></li>
                <li><a href=" ${pageContext.request.contextPath }/adminlogin"  class="nav-link"> ADMIN LOGIN</a></li>
                <li><a href=" ${pageContext.request.contextPath }/studentlogin" class="nav-link">STUDENT</a></li>
            </ul>
          </nav>
            <div class="body-div1">
        <div>STUDENT RESULTS</div>
  <a href="${pageContext.request.contextPath}/new"> 
  <button class="button"  id="addResult "><i class="fas fa-plus-circle"></i>Add Result</button>
  </a>  
    </div>
  <c:forEach var="list" items="${listresult}">
      <div class="article-card">
          
            <div class="card-text">
                <h1 id="student-rollno"><c:out value="${list.getRollno()}"  /></h1>
                <p id="student-name"><c:out value="${list.getName()}" /></p>
                <p id="student-fathername"><c:out value="${list.getFname()}" /></p>
                <p id="student-dbms"><c:out value="${list.getDbms()}"  /></h1>
                <p id="student-ds"><c:out value="${list. getData_structure()}" /></p>
                <p id="student-maths"><c:out value="${list.getDescrete_maths()}" /></p>     
            </div>
      	  <div class="card-buttons">
             <a href="edit?id=<c:out value='${list.getRollno()}' />"><button type="button" id="edit">EDIT</button></a> 
             <span>|</span>
             <a href="delete?id=<c:out value='${list.getRollno()}'/>"><button id="delete">DELETE</button></a>
            </div>
        </div>
     </c:forEach> 
</div>

<div class="body-div3">
<h1>${message}</h1>
</div>
    
</body>
</html>