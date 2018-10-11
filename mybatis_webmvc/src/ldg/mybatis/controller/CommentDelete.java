package ldg.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.repository.CommentSessionRepository;

public class CommentDelete implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentSessionRepository commentSessionSqlRepository = new CommentSessionRepository();
		Integer i = commentSessionSqlRepository.deleteComment(Long.parseLong(request.getParameter("commentNo")));
		if(i > 0) {
			forward.setRedirect(false);
			forward.setPath("./jsp/comment_delete.jsp");
		}else {
			forward.setRedirect(true);
			forward.setPath("/comment_form.ic");
		}
		return forward;
	}
}
