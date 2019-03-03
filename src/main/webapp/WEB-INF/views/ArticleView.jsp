<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:out value="${article.writer}"></c:out>
<c:out value="${article.brd_content}"></c:out>
<form action="/Article_delete" method="post">
<input type="hidden" name="brd_id" value="${article.brd_id}">
<input type="submit" value="글삭제">
</form>
<form action="/boardListView" method="get">
<input type="submit" value="리스트보기">
</form>
</body>
</html>