package ldg.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.model.CommentUser;
import ldg.mybatis.repository.CommentSessionResultMapRepository;

public class CommentAssociation implements Action {
	private CommentSessionResultMapRepository commentRepository = new CommentSessionResultMapRepository();
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentUser commentuser = commentRepository.selectCommentByPrimaryKeyAssociation(Long.parseLong(request.getParameter("commentNo")));
		request.setAttribute("CommentUser", commentuser);
		
		forward.setRedirect(false);
		forward.setPath("./jsp/comment_resultmap_association.jsp");
		return forward;
	}

}
