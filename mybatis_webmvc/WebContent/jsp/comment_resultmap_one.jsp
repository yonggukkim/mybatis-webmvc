<%-- <%@page import="java.io.*,java.util.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=euc-kr"%>
<%
//XML만으로 매핑구문과 결과매핑 처리
//CommentMapperDynamicSql.xml의 selectCommentByPrimaryKey매핑구문
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentResultMapService commentResultMapService = new CommentResultMapService();
Comment comment = commentResultMapService.selectByPrimaryKey(commentNo);
%>
<%=commentNo%>
댓글번호 : <%= comment.getCommentNo() %><br>
작성자아이디 : <%= comment.getUserId() %><br>
작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent() %><br> --%>

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
	게시물번호 : <%= comment.getCommentNo() %><br />
	유저아이디 : <%= comment.getUserId() %><br />
	내용 : <%= comment.getCommentContent() %><br />
	등록일 : <%= comment.getRegDate() %><br />
	<a href="./comment_form.ic">메인으로</a>
</body>
</html>