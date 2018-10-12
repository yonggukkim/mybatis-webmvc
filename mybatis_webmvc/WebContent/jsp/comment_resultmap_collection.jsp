<%-- <%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=euc-kr"%>
<%
//XML만으로 매핑구문과 결과매핑 처리
//CommentMapperResultMap.xml의 selectCommentByPrimaryKeyCollection매핑구문
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentResultMapService commentService = new CommentResultMapService();
Comment comment = commentService.selectCommentByPrimaryKeyCollection(commentNo);
%>
댓글번호 : <%= comment.getCommentNo() %><br>
댓글작성자 : <%= comment.getUserId() %><br>
댓글작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent() %><br>

+++ 여기부터 답글목록 +++ 
<% for( Reply reply : comment.getReplies() ){ %>
답글번호 : <%= reply.getReplyNo() %><br>
답글작성자 : <%= reply.getUserId() %><br>
답글작성일시 : <%= reply.getRegDate() %><br>
답글내용 : <%= reply.getReplyContent() %><br>
<% } %> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ldg.mybatis.model.*,java.util.*"%>
<%
	CommentCollections comment = (CommentCollections)request.getAttribute("comment");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	글번호 : <%= comment.getCommentNo() %><br />
	작성자 : <%= comment.getUserId() %><br />
	내용 : <%= comment.getCommentContent() %><br />
	작성일 : <%= comment.getRegDate() %><br />
	
	+++ 여기부터 답글목록 +++
	<% for(Reply reply : comment.getReplies()) { %>
		답글번호 : <%= reply.getReplyNo() %><br />
		답글작성자 : <%= reply.getUserId() %><br />
		답글작성일시 : <%= reply.getRegDate() %><br />
		답글내용 : <%= reply.getReplyContent() %><br />
	<% } %>
</body>
</html>