<%@page import="com.javaprac.dto.ArticleDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
USER ID : ${pageContext.request.userPrincipal.name}<br/>
<a href="${pageContext.request.contextPath}/j_spring_security_logout">Log Out</a>
<table>
		<tr>
			 <td>번호</td>
			 <td>작성자</td>
			 <td>제목</td>
			 <td>작성일</td>
			 <td>수정일</td>
			 <td>조회수</td>
		</tr>
		<c:forEach items="${list}" var="board">
		<tr>
			<td><c:out value="${board.brd_id}"></c:out></td>
			<td><c:out value="${board.writer}"></c:out></td>
			<td><a href="/ArticleView?brdId=${board.brd_id}"><c:out value="${board.brd_title}"></c:out></a></td>
			<td><fmt:formatDate value="${board.brd_create_date}" pattern="yyyy년MM월dd일HH시mm분ss초"/></td>
			<td><fmt:formatDate value="${board.brd_chg_date}" pattern="yyyy년MM월dd일HH시mm분ss초"/></td>
			<td><c:out value="${board.brd_views}"></c:out></td>
		</tr>
		</c:forEach>
</table>

<form action="/Article_Reg_View" method="get">
<input type="submit" value="글등록">
</form>

</body>
</html>
