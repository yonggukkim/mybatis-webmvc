<%-- <%@page import="java.io.*,java.util.*,javax.servlet.*,ldg.mybatis.service.*,ldg.mybatis.model.*" contentType="text/html; charset=utf-8"%>
<%
// http://localhost:8080/jsp/comment_dynamicsql_foreach.jsp?commentNos=1&commentNos=2
// XML만으로 매핑구문과 결과매핑 처리
// CommentMapperDynamicSql.xml의 selectCommentByConditionForeach매핑구문
String[] commentNos = request.getParameterValues("commentNos");
CommentDynamicSqlService commentService = new CommentDynamicSqlService();
List<Comment> comments = commentService.selectCommentForeach(commentNos);
%>
<% for( Comment comment : comments ){ %>
댓글번호 : <%= comment.getCommentNo() %><br>
작성자아이디 : <%= comment.getUserId() %><br>
작성일시 : <%= comment.getRegDate() %><br>
댓글내용 : <%= comment.getCommentContent() %><br>
<% } %> --%>

<%@page import="java.util.*,ldg.mybatis.model.*" contentType="text/html; charset=utf-8"%>
<%
	List<Comment> comments = (List<Comment>)request.getAttribute("comments");
	request.setCharacterEncoding("utf-8");
%>
<% for( Comment comment : comments ) { %>
댓글번호 : <%= comment.getCommentNo() %><br />
작성자 아이디 : <%= comment.getUserId() %><br />
작성일시 : <%= comment.getRegDate() %><br />
댓글내용 : <%= comment.getCommentContent() %><br /><br />
<% } %>