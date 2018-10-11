package ldg.mybatis.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.CommentSessionRepository;

public class CommentInsert implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentSessionRepository commentSessionRepository = new CommentSessionRepository();
		Comment comment = new Comment(Long.parseLong(request.getParameter("commentNo")), request.getParameter("userId"), Calendar.getInstance().getTime(),request.getParameter("commentContent"));
		Integer i = commentSessionRepository.insertComment(comment);
		request.setAttribute("Comment", comment);
		if(i > 0) {
			forward.setRedirect(false);
			forward.setPath("./jsp/comment_insert.jsp");
		}else {
			forward.setRedirect(true);
			forward.setPath("/comment_form.ic");
		}
		return forward;
	}

}
