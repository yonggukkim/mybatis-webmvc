<%-- <%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf8"%>
<%
//XML만으로 매핑구문과 결과매핑 처리
//CommentMapper.xml의 updateCommentTrim매핑구문
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
String userId = request.getParameter("userId");
String commentContent = request.getParameter("commentContent");
Comment comment = new Comment(commentNo, userId, Calendar.getInstance().getTime(), commentContent);
CommentService commentService = new CommentService();
Integer result = commentService.insertComment(comment);
%>
<%= result %> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ldg.mybatis.model.*"%>
<% 	
	request.setCharacterEncoding("utf-8");
	Comment comment = (Comment)request.getAttribute("Comment");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	게시물번호 <%= comment.getCommentNo() %><br />
	유저아이디 <%= comment.getUserId() %><br />
	내용 <%= comment.getCommentContent() %><br />
	등록일 <%= comment.getRegDate() %><br />
	<a href="./comment_form.ic">메인으로</a>
</body>
</html>