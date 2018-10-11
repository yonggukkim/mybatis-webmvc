package ldg.mybatis.service;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.CommentUser;
import ldg.mybatis.repository.CommentSessionResultMapRepository;

public class CommentResultMapService {
	private CommentSessionResultMapRepository commentRepository = 
			new CommentSessionResultMapRepository();
	
	public Comment selectByPrimaryKey(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKey(commentNo);
	}
	
	//1:1 출력
	public CommentUser selectCommentByPrimaryKeyAssociation(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKeyAssociation(commentNo);
	}
	
	//1대 N 출력
	public Comment selectCommentByPrimaryKeyCollection(Long commentNo){
		return commentRepository.selectCommentByPrimaryKeyCollection(commentNo);
	}
	
	//생성자 이용
	public Comment selectCommentByPrimaryKeyConstructor(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKeyConstructor(commentNo);
	}
	
	//동적 출력
	public Comment selectCommentByPrimaryKeyDiscriminator(Long commentNo) {
		return commentRepository.selectCommentByPrimaryKeyDiscriminator(commentNo);
	}	
}