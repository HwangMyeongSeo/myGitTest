<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>글등록</h1>
<form action="/Article_Reg" method="post">
	<table>
		<tr>
			<td>글쓴이</td>
			<td><input type="text" id="writer" name="writer"></td>
		</tr>
		<tr>
			<td>제목</td>
			<td><input type="text" id="brd_title" name="brd_title"></td>
		</tr>
		<tr>
			<td>내용</td>
			<td><textarea rows="15" cols="40" id="brd_content" name="brd_content"></textarea> </td>
		</tr>
	</table>
	<input type="submit" value="글등록">
	<input type="reset" value="다시작성">
</form>
</body>
</html>