package ldg.mybatis.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Webcontroller extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqeuestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = reqeuestURI.substring(contextPath.length());
		ActionForward forward = null;
		Action action = null;
		if(command.equals("/comment_form.ic")) {
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath("./jsp/comment_form.jsp");
		}else if(command.equals("/comment_insert.ic")) {
			action = new CommentInsert();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/comment_resultmap_one.ic")) {
			action = new CommentSelect();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/comment_update.ic")) {
			action = new CommentUpdate();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/comment_delete.ic")) {
			action = new CommentDelete();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/comment_resultmap_discriminator.ic")) {
			action = new CommentDiscriminator();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/comment_resultmap_association.ic")) {
			action = new CommentAssociation();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/comment_resultmap_collection.ic")) {
			action = new CommentCollection();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/comment_resultmap_constructor.ic")) {
			action = new CommentResultMapService();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/comment_dynamicsql_foreach.ic")) {
			action = new CommentDynamicsqlForeach();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}else if(command.equals("/comment_dynamicsql_select.ic")) {
			action = new commentDynamicsqlSelect();
			try {
				forward = action.execute(request, response);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		if(forward != null) {
			if(forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher dispatcher = request.getRequestDispatcher(forward.getPath());
				dispatcher.forward(request, response);
			}
		}
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
}
