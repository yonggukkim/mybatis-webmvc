<%-- <%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf-8"%>
<%
//XML만으로 매핑구문과 결과매핑 처리
//CommentMapperResultMap.xml의 selectCommentByPrimaryKeyAssociation매핑구문
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentResultMapService commentService = new CommentResultMapService();
Comment comment = commentService.selectCommentByPrimaryKeyDiscriminator(commentNo);
%>
댓글번호 : <%= comment.getCommentNo() %><br>
작성자아이디 : <%= comment.getUserId() %><br>
작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent() %><br> --%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ldg.mybatis.model.*, java.util.*" %>
<%
Comment comment = (Comment)request.getAttribute("comment");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
댓글번호 : <%= comment.getCommentNo() %>
작성자 아이디 : <%= comment.getUserId() %>
작성일시 : <%= comment.getRegDate() %>
댓글내용 : <%= comment.getCommentContent() %>
</body>
</html>