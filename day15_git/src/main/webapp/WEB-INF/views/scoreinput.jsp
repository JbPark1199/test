<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="scoresave" method="post">
<table>
<tr>
<th>이름</th>
<td><input type="text" name="name">
</tr>

<tr>
<th>국어</th>
<td><input type="text" name="kor">
</tr>

<tr>
<th>영어</th>
<td><input type="text" name="eng">
</tr>

<tr>
<th>수학</th>
<td><input type="text" name="mat">
</tr>
</table>

</form>
<input type="submit" value="전송">

</body>
</html>