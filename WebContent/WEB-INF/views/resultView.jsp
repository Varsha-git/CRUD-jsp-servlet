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
          <form action =" ${pageContext.request.contextPath }/new"  method="post">
          <input id="rollno"  name="rollno"  placeholder="rollno"  type="text" />
          <input id="name"  name="name"  placeholder="Student Name"  type="text" />
          <input id="fname"  name="fname"  placeholder="Father's Name"  type="text" />
          <input id="dbms"  name="dbms"  placeholder="Enter marks DBMS"  type="text" />
          <input id="ds"  name="ds"  placeholder="Enter marks DS"  type="text" />
          <input id="maths"  name="maths"  placeholder="Enter marks MATHS"  type="text" />
          <button id="post"  type="submit" > ADD </button>
          </form>
</body>
</html>