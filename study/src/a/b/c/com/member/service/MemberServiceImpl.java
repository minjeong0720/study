package a.b.c.com.member.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.member.dao.MemberDAO;
import a.b.c.com.member.vo.MemberVO;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

	private MemberDAO memberDAO;
	
	// 생성자에 @Autowired 어노테이션으로  DI (의존성 주입하기)
	@Autowired(required=false)
	public MemberServiceImpl(MemberDAO memberDAO){
		this.memberDAO = memberDAO;
	}
		
//	@Override
//	public List<MemberVO> memberSelectAll(MemberVO mvo) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<MemberVO> memberSelect(MemberVO mvo) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
	@Override
	public int memberInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
	
		return memberDAO.memberInsert(mvo);
	}
//
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
