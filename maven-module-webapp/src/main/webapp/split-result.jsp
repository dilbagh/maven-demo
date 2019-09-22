<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Name Splitter Results</title>
</head>
<body>
<h2>Name Splitter Results</h2>
<b><label for="firstName">First Name: </label></b>
<label id="firstName">${splittedName.firstName}</label>
<br><br>
<b><label for="middleName">Middle Name: </label></b>
<label id="middleName">${splittedName.middleName}</label>
<br><br>
<b><label for="lastName">Last Name: </label></b>
<label id="lastName">${splittedName.lastName}</label>
<br><br><br>
<a href="index.html">Back</a>
</body>
</html>