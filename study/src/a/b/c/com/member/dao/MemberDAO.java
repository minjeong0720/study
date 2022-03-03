package a.b.c.com.member.dao;

import java.util.HashMap;
import java.util.List;

import a.b.c.com.member.vo.MemberVO;

public interface MemberDAO {
	
	// 로그인
	public List<HashMap<String, Object>> login(MemberVO member) throws Exception;

	//public List<MemberVO> memberSelectAll(MemberVO mvo);
	//public List<MemberVO> memberSelect(MemberVO mvo);
	public int memberInsert(MemberVO mvo);
	//public int memberUpdate(MemberVO mvo);
	//public int memberDelete(MemberVO mvo);
	
	
}
