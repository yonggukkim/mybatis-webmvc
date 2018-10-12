package ldg.mybatis.repository;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.CommentCollections;
import ldg.mybatis.model.CommentUser;

public class CommentSessionResultMapRepository {
	private final String namespace = "ldg.mybatis.repository.mapper.CommentMapperResultMap";

	private SqlSessionFactory getSqlSessionFactory() {
		String resource = "mybatis-config.xml";
		InputStream inputStream;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			throw new IllegalArgumentException(e);
		}
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	//primary key에 의한 출력
	public Comment selectCommentByPrimaryKey(Long commentNo){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try{
			String statement = namespace + ".selectCommentByPrimaryKey";
			return (Comment)sqlSession.selectOne(statement, commentNo);	
		}finally{
			sqlSession.close();
		}
	}

	// 1:1의 출력
	public CommentUser selectCommentByPrimaryKeyAssociation(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyAssociation";
			return (CommentUser)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
	
	//1:N출력
	public CommentCollections selectCommentByPrimaryKeyCollection(Long commentNo){
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try{
			String statement = namespace + ".selectCommentByPrimaryKeyCollection";
			return (CommentCollections)sqlSession.selectOne(statement,commentNo);
		}finally{
			sqlSession.close();
		}
	}
	
	//생성자를 통한 값 전달
	public Comment selectCommentByPrimaryKeyConstructor(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyConstructor";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}

	// 동적 할당
	public Comment selectCommentByPrimaryKeyDiscriminator(Long commentNo) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByPrimaryKeyDiscriminator";
			return (Comment)sqlSession.selectOne(statement, commentNo);
		} finally {
			sqlSession.close();
		}
	}
	

}
