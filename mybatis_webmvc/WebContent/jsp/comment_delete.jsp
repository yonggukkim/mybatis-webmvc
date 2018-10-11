<%-- <%@page import="java.io.*,java.util.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=euc-kr"%>
<%
//XML만으로 매핑구문과 결과매핑 처리
//CommentMapperDynamicSql.xml의 selectCommentByPrimaryKey매핑구문
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentService commentService = new CommentService();
Integer result = commentService.deleteComment(commentNo);
%>
<%=commentNo%> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	삭제가 완료되었습니다.
	<a href="./comment_form.ic">메인으로</a>
</body>
</html>