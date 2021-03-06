package a.b.c.com.member.dao;


import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import a.b.c.com.member.controller.MemberController;
import a.b.c.com.member.vo.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	Logger logger = Logger.getLogger(MemberDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSession sqlSession;
	
	// 로그인
	@Override
	public List<HashMap<String, Object>> login(MemberVO member) throws Exception {
		logger.info("MemberDAOImpl.login() 함수 시작");
		
		return sqlSession.selectList("memberMapper.login", member);
	}
//	@Override
//	public List<MemberVO> memberSelectAll(MemberVO mvo) {
//		// TODO Auto-generated method stub
//		return null;
//	}

//	@Override
//	public List<MemberVO> memberSelect(MemberVO mvo) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public int memberInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		return (Integer)sqlSession.insert("memberInsert",mvo);
	}

//	@Override
//	public int memberUpdate(MemberVO mvo) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//	@Override
//	public int memberDelete(MemberVO mvo) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
