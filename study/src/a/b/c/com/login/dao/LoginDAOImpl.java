package a.b.c.com.login.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.member.vo.MemberVO;

@Repository
public class LoginDAOImpl implements LoginDAO {
	Logger logger = Logger.getLogger(LoginDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;

	
	@Override
	public List<MemberVO> loginCheck(MemberVO mvo) {
		// TODO Auto-generated method stub
		return sqlSession.selectList("loginCheck", mvo);
	}


}
