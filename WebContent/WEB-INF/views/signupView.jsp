<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link type="text/css" rel="stylesheet"  href="./css/style.css">
<title>FACE UNIVERSITY</title>
</head>
<body>
		 <nav>
        <ul>
            <li class="logo-text">
             <img src="../WebContent/assets/face_logo.svg"  alt="logo">
            </li>
             </ul>
            <ul>
                <li><a href= " ${pageContext.request.contextPath }/adminsignup"   class="nav-link">ADMIN SIGN UP</a></li>
                <li><a href=" ${pageContext.request.contextPath }/adminlogin"  class="nav-link"> ADMIN LOGIN</a></li>
                <li><a href=" ${pageContext.request.contextPath }/studentlogin" class="nav-link">STUDENT</a></li>
                <li><a href=" ${pageContext.request.contextPath }/contact" class="nav-link link-button">CONTACT</a></li>
            </ul>
          </nav>
          <div class=" result-page"> Result Page</div>
          <div class=" good-process"  >A good process produces good result </div>
          <div class="signup-form">
          		<div class="title"> SIGN UP</div>
          		<form action=" ${pageContext.request.contextPath }/adminsignup"   method="post">
          		<label class="label"  for="email">Email </label>
          		<input type="text"  name="email"  id="email">
          		<label class="label"  for="password">Password </label>
          		<input type="text"  name="password"  id="password">
          		<div class="password-hint">Must contain 6 character, 1 digit, 1 uppercase letter</div>
          			<label class="label"  for="password">Confirm Password </label>
          		<input type="text"  name="confirmpassword"  id="confirmpassword">
          		${message}
          		<button class="button"  type="submit">Login</button>
          		</form>	
          </div>
</body>
</html>