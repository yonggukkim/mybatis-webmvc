<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
                                         "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<!-- <form name="frm1" action="comment_dynamicsql_foreach.jsp" 
	method="POST">
		<input type="text" name="commentNos">
		<input type="text" name="commentNos">
		<input type="text" name="commentNos">
		<input type="submit" value="전송">
	</form><p> -->
<!-- 	<form name="frm2" action="comment_dynamicsql_select.jsp" 
	method="POST">
		<input type="text" name="commentNo">
		<input type="submit" value="전송">
	</form><p> -->
	ASSOCI<form name="frm3" action="comment_resultmap_association.ic" method="POST"> <!-- comment_resultmap_association.jsp -->
		<input type="text" name="commentNo">
		<input type="submit" value="전송">
	</form><p>
	<!-- <form name="frm4" action="comment_resultmap_collection.jsp" 
	method="POST">
		<input type="text" name="commentNo">
		<input type="submit" value="전송">
	</form><p> -->
	<!-- <form name="frm5" action="comment_resultmap_constructor.jsp" 
	method="POST">
		<input type="text" name="commentNo">
		<input type="submit" value="전송">
	</form>	<p> -->
	DOSCRIMIN <form name="frm6" action="comment_resultmap_discriminator.ic" method="POST"><!-- comment_resultmap_discriminator.jsp -->
		<input type="text" name="commentNo">
		<input type="submit" value="전송">
	</form><p>
	SELECT <form name="frm7" action="comment_resultmap_one.ic" method="POST"><!-- comment_resultmap_one.jsp -->
		<input type="text" name="commentNo">
		<input type="submit" value="전송">
	</form>	<p>		
	UPDATE <form name="frm8" action="comment_update.ic" method="POST">
		댓글번호<input type="text" name="commentNo"><br>
		변경할 아이디 값<input type="text" name="userId"><br>
		변경할 내용<input type="text" name="commentContent">
		<input type="submit" value="전송">
	</form><p>		
	생성
	<form name="frm9" action="comment_insert.ic" method="POST"><!-- comment_form.jsp -->
		댓글번호<input type="text" name="commentNo"><br>
		입력할 아이디 값<input type="text" name="userId"><br>
		입력할 내용<input type="text" name="commentContent">
		<input type="submit" value="전송">
	</form><p>		
	DELETE <form name="frm10" action="comment_delete.ic" method="POST"> <!-- comment_delete.jsp -->
		<input type="text" name="commentNo">
		<input type="submit" value="전송">
	</form>	
	
	
	
	
	
	 
</body>
</html>