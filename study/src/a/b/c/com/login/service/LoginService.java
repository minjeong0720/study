package a.b.c.com.login.service;

import java.util.List;

import a.b.c.com.member.vo.MemberVO;

public interface LoginService {
	
	public List<MemberVO> loginCheck(MemberVO mvo);
	

}
