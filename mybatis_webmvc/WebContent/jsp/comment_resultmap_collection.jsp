<%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=euc-kr"%>
<%
//XML������ ���α����� ������� ó��
//CommentMapperResultMap.xml�� selectCommentByPrimaryKeyCollection���α���
Long commentNo = Long.parseLong(request.getParameter("commentNo"));
CommentResultMapService commentService = new CommentResultMapService();
Comment comment = commentService.selectCommentByPrimaryKeyCollection(commentNo);
%>
��۹�ȣ : <%= comment.getCommentNo() %><br>
����ۼ��� : <%= comment.getUserId() %><br>
����ۼ��Ͻ� : <%= comment.getRegDate() %><br>
��۳��� : <%= comment.getCommentContent() %><br>

+++ ������� ��۸�� +++ 
<% for( Reply reply : comment.getReplies() ){ %>
��۹�ȣ : <%= reply.getReplyNo() %><br>
����ۼ��� : <%= reply.getUserId() %><br>
����ۼ��Ͻ� : <%= reply.getRegDate() %><br>
��۳��� : <%= reply.getReplyContent() %><br>
<% } %>