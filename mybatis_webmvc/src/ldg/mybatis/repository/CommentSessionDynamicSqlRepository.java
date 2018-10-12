package ldg.mybatis.repository;

import java.util.List;
import java.util.Map;

import ldg.mybatis.model.Comment;
import ldg.mybatis.model.User;

import org.apache.ibatis.session.SqlSession;

public class CommentSessionDynamicSqlRepository extends AbstractRepository {
	private final String namespace = "ldg.mybatis.repository.mapper.CommentMapperDynamicSql";

	public List<Comment> selectCommentByConditionTrim(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByConditionTrim";
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}
	
	public List<Comment> selectCommentByConditionForeach(Map<String, Object> condition) {
		SqlSession sqlSession = getSqlSessionFactory().openSession();
		try {
			String statement = namespace + ".selectCommentByConditionForeach";
			return sqlSession.selectList(statement, condition);
		} finally {
			sqlSession.close();
		}
	}
}
