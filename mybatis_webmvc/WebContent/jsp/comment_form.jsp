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
	���� �� ��ȸ
	<form name="frm1" action="comment_dynamicsql_foreach.ic" method="POST"><!-- sql���� in��� �ϰڴٴ� �� -->
		<input type="text" name="commentNos"><br />
		<input type="text" name="commentNos"><br />
		<input type="text" name="commentNos"><br />
		<input type="submit" value="����">
	</form><p>
	���� ���� ��ȸ
	<form name="frm2" action="comment_dynamicsql_select.ic" 
	method="POST">
	�۹�ȣ : <input type="text" name="commentNo"><br />
	���̵� : <input type="text" name="userId"><br />
		<input type="submit" value="����">
	</form><p>
	��� ��������
	<form name="frm3" action="comment_resultmap_association.ic" method="POST"> <!-- comment_resultmap_association.jsp -->
		<input type="text" name="commentNo">
		<input type="submit" value="����">
	</form><p>
	1:n���
	<form name="frm4" action="comment_resultmap_collection.ic" 
	method="POST">
		<input type="text" name="commentNo">
		<input type="submit" value="����">
	</form><p>
	������ �̿� ��ȸ
	<form name="frm5" action="comment_resultmap_constructor.ic" 
	method="POST">
		<input type="text" name="commentNo">
		<input type="submit" value="����">
	</form>	<p>
	���� ��� 
	<form name="frm6" action="comment_resultmap_discriminator.ic" method="POST"><!-- comment_resultmap_discriminator.jsp -->
		<input type="text" name="commentNo">
		<input type="submit" value="����">
	</form><p>
	1:1��ȸ
	<form name="frm7" action="comment_resultmap_one.ic" method="POST"><!-- comment_resultmap_one.jsp -->
		<input type="text" name="commentNo">
		<input type="submit" value="����">
	</form>	<p>		
	������Ʈ 
	<form name="frm8" action="comment_update.ic" method="POST">
		��۹�ȣ<input type="text" name="commentNo"><br>
		������ ���̵� ��<input type="text" name="userId"><br>
		������ ����<input type="text" name="commentContent">
		<input type="submit" value="����">
	</form><p>		
	����
	<form name="frm9" action="comment_insert.ic" method="POST"><!-- comment_form.jsp -->
		��۹�ȣ<input type="text" name="commentNo"><br>
		�Է��� ���̵� ��<input type="text" name="userId"><br>
		�Է��� ����<input type="text" name="commentContent">
		<input type="submit" value="����">
	</form><p>		
	����
	 <form name="frm10" action="comment_delete.ic" method="POST"> <!-- comment_delete.jsp -->
		<input type="text" name="commentNo">
		<input type="submit" value="����">
	</form>	
	
</body>
</html>