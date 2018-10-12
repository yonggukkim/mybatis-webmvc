package ldg.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.model.CommentCollections;
import ldg.mybatis.repository.CommentSessionResultMapRepository;

public class CommentCollection implements Action{
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentSessionResultMapRepository commentRepository = new CommentSessionResultMapRepository();
		Long commentNo = Long.parseLong(request.getParameter("commentNo"));
		CommentCollections comment = (CommentCollections)commentRepository.selectCommentByPrimaryKeyCollection(commentNo);
		/*CommentReplies comment = (CommentReplies)commentRepository.selectCommentByPrimaryKeyCollection(commentNo);*/
		request.setAttribute("comment", comment);
		
		forward.setRedirect(false);
		forward.setPath("jsp/comment_resultmap_collection.jsp");
		return forward;
	}
}
