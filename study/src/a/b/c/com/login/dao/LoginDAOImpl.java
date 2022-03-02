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
	//public List<MemberVO> loginCheck(MemberVO mvo) {
	public MemberVO loginCheck(MemberVO mvo) throws Exception{
		// TODO Auto-generated method stub
		
		//loginCheck(MemberVO mvo)에 파라미터 값이 전달되며 xml에서 조회한 데이터들은 MemberVO 에 담긴다.
		//return sqlSession.selectList("loginCheck", mvo);
		return sqlSession.selectOne("loginCheck", mvo);
	}


}
