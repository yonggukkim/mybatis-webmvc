package ldg.mybatis.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ldg.mybatis.model.Comment;
import ldg.mybatis.repository.CommentSessionDynamicSqlRepository;

public class CommentDynamicsqlForeach implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		ActionForward forward = new ActionForward();
		CommentSessionDynamicSqlRepository commentRepository = new CommentSessionDynamicSqlRepository();
		// 배열로 가져옴
		String [] commentNos = request.getParameterValues("commentNos");
		// 리스트를 이용해서 배열에 있는 것을 저장한다.
				List<Long> cn = new ArrayList<Long>();
				for(String st : commentNos) {
					cn.add(Long.parseLong(st));
				}
		// 마이바티스에서 parameter를 Map으로 받으므로 Map에 저장하여 전달.
		// 맵으로 전달하기위해서 맵을 선언
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("commentNos", cn);
		List<Comment> comments = (List<Comment>)commentRepository.selectCommentByConditionForeach(condition);
		
		if(comments != null) {
		request.setAttribute("comments", comments);
		forward.setRedirect(false);
		forward.setPath("jsp/comment_dynamicsql_foreach.jsp");
		} else {
			forward.setRedirect(true);
			forward.setPath("comment_form.ic");
		}
		return forward;
	}

}
