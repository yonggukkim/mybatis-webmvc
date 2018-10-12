package ldg.mybatis.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.CommentSessionResultMapRepository;

public class CommentResultMapService implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ActionForward forward = new ActionForward();
		CommentSessionResultMapRepository commentRepository = new CommentSessionResultMapRepository();
		Long commentNo = Long.parseLong(request.getParameter("commentNo"));
		Comment comment = (Comment)commentRepository.selectCommentByPrimaryKeyConstructor(commentNo);
		
		
		if(comment != null) {
		request.setAttribute("comment", comment);
		forward.setRedirect(false);
		forward.setPath("jsp/comment_resultmap_constructor.jsp");
		}else {
			forward.setRedirect(true);
			forward.setPath("comment_form.ic");
		}	
		return forward;
	}

}
