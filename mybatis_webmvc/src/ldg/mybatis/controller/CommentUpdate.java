package ldg.mybatis.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.CommentSessionRepository;

public class CommentUpdate implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentSessionRepository commentSessionRepository = new CommentSessionRepository();
		Comment comment = new Comment();
		comment.setCommentNo(Long.parseLong(request.getParameter("commentNo")));
		comment.setUserId(request.getParameter("userId"));
		comment.setCommentContent(request.getParameter("commentContent"));
		Integer i = commentSessionRepository.updateCommentIf(comment);
		if(i > 0) {
			request.setAttribute("Comment", comment);
			forward.setRedirect(false);
			forward.setPath("./jsp/comment_update.jsp");
		}else {
			forward.setRedirect(true);
			forward.setPath("/comment_form.ic");
		}
		return forward;
	}

}
