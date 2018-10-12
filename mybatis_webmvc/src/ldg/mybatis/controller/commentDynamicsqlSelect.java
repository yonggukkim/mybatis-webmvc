package ldg.mybatis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.User;
import ldg.mybatis.repository.CommentSessionDynamicSqlRepository;

public class commentDynamicsqlSelect implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		
		Long commentNo = Long.parseLong(request.getParameter("commentNo"));
		String userId = request.getParameter("userId");
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNo", commentNo);
		User user = new User();
		user.setUserId(userId);
		condition.put("user", user);
		CommentSessionDynamicSqlRepository commentRepository = new CommentSessionDynamicSqlRepository();
		List<Comment> comments = commentRepository.selectCommentByConditionTrim(condition);
		if(comments != null) {
		request.setAttribute("comments", comments);
		forward.setRedirect(false);
		forward.setPath("jsp/comment_dynamicsql_select.jsp");
		} else {
			forward.setRedirect(true);
			forward.setPath("comment_form.ic");
		}
		return forward;
	}

}
