package a.b.c.com.login.dao;

import java.util.List;

import a.b.c.com.member.vo.MemberVO;

public interface LoginDAO {
	
	public List<MemberVO> loginCheck(MemberVO mvo);
	

}
