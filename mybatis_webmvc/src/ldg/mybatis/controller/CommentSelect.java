package ldg.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.CommentSessionResultMapRepository;

public class CommentSelect implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentSessionResultMapRepository commentSessionRepository = new CommentSessionResultMapRepository();
		Comment comment = (Comment)commentSessionRepository.selectCommentByPrimaryKey(Long.parseLong(request.getParameter("commentNo")));
		request.setAttribute("Comment", comment);
		forward.setRedirect(false);
		forward.setPath("./jsp/comment_resultmap_one.jsp");
		return forward;
	}

}
