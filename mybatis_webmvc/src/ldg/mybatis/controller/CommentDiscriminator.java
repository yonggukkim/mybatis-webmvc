package ldg.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.CommentSessionResultMapRepository;

public class CommentDiscriminator implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentSessionResultMapRepository CommentRepository = new CommentSessionResultMapRepository();
		long commentNo = Long.parseLong(request.getParameter("commentNo"));
		Comment comment = CommentRepository.selectCommentByPrimaryKeyDiscriminator(commentNo);
		
		request.setAttribute("comment", comment);
		forward.setRedirect(false);
		forward.setPath("./jsp/comment_resultmap_discriminator.jsp");
		return forward;
	}

}
